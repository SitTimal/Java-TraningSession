package OOPConceptPart1;

public class WrapperclassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);

		// data conversion :String to integer:

		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		// Integer,double,character,conversion:

		// string to double conversion.

		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d + 10);

		// string to boolean

		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		// integer to string conversion:

		int j = 200;
		System.out.println(j + 20);

		String s = String.valueOf(j); // "200"
		System.out.println(s + 20);

		String u = "100a";
		Integer.parseInt(u); // Number format Exception ---For input string:100a.
	}

}
