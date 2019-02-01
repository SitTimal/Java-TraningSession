package OOPConceptPart1;

public class LocalvsGlobalVariables {

	// global variables --class variables

	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {

		int i = 10; // local variable
		System.out.println(i);

		LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

	public void sum() {
		int i = 15;
		int j = 20;
	}
}
