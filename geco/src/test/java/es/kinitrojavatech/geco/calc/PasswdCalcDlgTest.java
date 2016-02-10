/**
 *
 */
package es.kinitrojavatech.geco.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author quique
 *
 */
public class PasswdCalcDlgTest {

	/**
	 * Test method for
	 * {@link es.kinitrojavatech.geco.calc.PasswdCalcDlg#generatePasswd(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testGeneratePasswd() {
		assertEquals("chess", PasswdCalcDlg.parseUrl("http://www.chess.com/"));
		assertEquals("bankinter",
				PasswdCalcDlg.parseUrl("https://www.bankinter.com/www/es-es/cgi/ebk+opr+extractointegral"));
		assertEquals("bankinter",
				PasswdCalcDlg.parseUrl("https://www.bankinter.com/www/es-es/cgi/ebk+opr+extractointegral"));
		assertEquals("geekytheory",
				PasswdCalcDlg.parseUrl("https://geekytheory.com/instalacion-y-uso-de-clamav-el-antivirus-de-linux/"));
                assertEquals("geekytheory",
				PasswdCalcDlg.parseUrl("geekytheory"));
	}

}
