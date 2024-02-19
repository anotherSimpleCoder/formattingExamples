package formatting;

import java.util.Locale;

public class Formatting {
	public static void formatInteger(Locale l, int a) {
		System.out.printf(l, "%,d\n", a);
	}
	
	public static void formatFloatingPointNumber(Locale l, double a) {
		System.out.printf(l, "%,.3f\n", a);
	}
}
