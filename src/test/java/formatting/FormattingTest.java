package formatting;

import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * HINWEIS: Die Zahlenausgabe ist nach dem US-Formatierungsstandard.
 * Falls man es in deutschem Standard haben will bitte die Methoden-
 * aufrufe dementsprechend ändern.
 * */
public class FormattingTest {
	@Test
	public void testFormatInteger() {
		int x1 = 30;
		Formatting.formatInteger(Locale.US, x1);	//Output: 30
		
		
		int x2 = 3000000;
		Formatting.formatInteger(Locale.US, x2);	//Output: 3,000,000
	}
	
	@Test
	public void testFormatFloatingPointNumber() {
		double x1 = 3.9;
		Formatting.formatFloatingPointNumber(Locale.US, x1);	//Output: 3.900
		
		double x2 = 4132.48;
		Formatting.formatFloatingPointNumber(Locale.US, x2);	//Output: 4,132.48
	}
}
