package JavaBasic;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		int b = 200;

		String x = "hello";
		String y = "world";

		System.out.println(a + b);
		System.out.println(x + y);
		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);
		System.out.println(x + y + (a + b));
		System.out.println(a + b + x + y + a + b + x + y);
		System.out.println("The value of a is" + a);
		System.out.println("The value of b is " + b);

	}

}
