package OOPConceptPart2;

public class Testcar {

	public static void main(String[] args) {

		// static polymorphism --compile -time polymorphism

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsaftey();
		b.engine();

		System.out.println("*******");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();

		System.out.println("******");

		// Top casting
		Car c1 = new BMW();// child class object can be referred by parent class reference variable
							// --dynamic polymorphism--run time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();

		// Down casting
		BMW b1 = (BMW) new Car();// ClassCastException

	}

}
