package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	// global variables : the scoop of variable will be available across all the
	// functions with some conditions.

	String name = "Tom";// non static global variable
	static int age = 25;// static global variable

	public static void main(String[] args) {
		// how to call static methods and variables
		// 1. direct calling.
		sum();
		// 2.calling by classname;
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendmail();
		System.out.println(obj.name);

		// can I access static methods by using object reference ? yes
		obj.sum(); // warning will be given

		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);

	}

	public void sendmail() {// non static method
		System.out.println("send mail method");
	}

	public static void sum() { // static method
		System.out.println("sum method");
	}

}
