package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();

		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);

	}

	public static void main(int i) {

	}

	public static void main(int q, int h) {

	}
	// we can over load main method.
	// you can not create a method inside a method.
	// duplicate methods --ie same method name with same number of arguments are not
	// allowed.

// method overloading -- when the method name is same  with different arguments or input parameters with the same class.
	public void sum() { // 0 input parameter
		System.out.println("sum method --zeroparm");

	}

	public void sum(int i) {// 1 input parameter
		System.out.println("sum method -- 1 input parameter");
		System.out.println(i);
	}

	public void sum(int k, int l) {// 2 input parameter
		System.out.println("sum method --2 input parameter");
		System.out.println(k + l);
	}

}
