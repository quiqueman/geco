package es.kinitrojavatech.geco.desktop;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class DesktopIntegration {
	private final static DesktopIntegration INSTANCE = new DesktopIntegration();

	private final Runtime runtime;

	private LinkedList<String> mountedEncFs;

	protected DesktopIntegration() {
		runtime = Runtime.getRuntime();
	}

	public static DesktopIntegration getDesktop() {
		return INSTANCE;
	}

	private int execAndWait(final String[] args) throws IOException, InterruptedException {
		final Process process = runtime.exec(args);
		return process.waitFor();
	}

	private BufferedReader execWaitAndGetSysout(final String[] args) throws IOException, InterruptedException {
		final Process process = runtime.exec(args);
		process.waitFor();
		if (process.getInputStream() != null) {
			return new BufferedReader(new InputStreamReader(process.getInputStream()));
		}
		return null;
	}

	public void browse(final String url) throws URISyntaxException, IOException {
		if (Desktop.isDesktopSupported()) {
			final Desktop desktop = Desktop.getDesktop();
			if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
				final URI uri = new URI(url);
				desktop.browse(uri);
			} else {
				JOptionPane.showMessageDialog(null, "La integración con el desktop no soporta la acción Browse",
						"Integración con el desktop", JOptionPane.ERROR_MESSAGE);
				throw new UnsupportedOperationException();
			}
		} else {
			JOptionPane.showMessageDialog(null, "No se soporta la integración con este desktop",
					"Integración con el desktop", JOptionPane.ERROR_MESSAGE);
			throw new UnsupportedOperationException();
		}
	}

	public void getMountedEncFs() {
		mountedEncFs = new LinkedList<String>();
		try {
			final BufferedReader is = execWaitAndGetSysout(new String[] { "mount", "-l", "-t", "fuse.encfs" });
			String line;
			while ((line = is.readLine()) != null) {
				final int start = line.indexOf('/');
				final int end = line.indexOf(' ', start);
				line = line.substring(start, end);
				mountedEncFs.add(line);
			}
		} catch (IOException | InterruptedException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Buscando EncFs montados", JOptionPane.ERROR_MESSAGE);
		}
	}

	public boolean isEncFsMounted(final String mountPoint) {
		if (mountedEncFs == null) {
			getMountedEncFs();
		}
		return mountedEncFs.contains(mountPoint);
	}

	public int mountEncFs(final String encFsPath, final String mountPoint, final char[] cs)
			throws IOException, InterruptedException {
		final String[] args = new String[] { "encfs", "--standard", "--extpass=echo " + String.valueOf(cs), encFsPath,
				mountPoint };
		return DesktopIntegration.getDesktop().execAndWait(args);

	}

	public int unmountEncFs(final String mountPath) throws IOException, InterruptedException {
		final String[] args = new String[] { "fusermount", "-u", mountPath };
		return DesktopIntegration.getDesktop().execAndWait(args);
	}
}
