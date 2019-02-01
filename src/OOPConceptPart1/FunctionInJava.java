package OOPConceptPart1;

public class FunctionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionInJava obj = new FunctionInJava();

		obj.test();

		int i = obj.pqr();
		System.out.println(i);

		String s1 = obj.qa();
		System.out.println(s1);

		int div = obj.division(30, 10);
		System.out.println(div);

	}

	// void does not return any value.//No input no output
	public void test() {
		System.out.println("test method");
	}

	// return type = int //no input some output
	public int pqr() {
		System.out.println("pqr method");

		int a = 10;
		int b = 20;
		int c = a - b;
		return c;
	}

	// no input some output
	public String qa() {
		System.out.println("qa method");
		String s = "Selenium";
		return s;

	}

	public int division(int x, int y) {
		System.out.println("division method");
		int d = x / y;

		return d;

	}

}
