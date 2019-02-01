package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i.length);

		for (int j = 0; j <= 1; j++) {
			System.out.println(j);
		}

		double d[] = new double[3];
		d[0] = 22.22;
		d[1] = 33.33;
		d[2] = 44.44;

		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 2;
		c[2] = 't';

		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		String s[] = new String[3];
		s[0] = "hellow";
		s[1] = "world";
		s[2] = "test";
		System.out.println(s.length);

		Object ob[] = new Object[6];
		ob[0] = "Sita";
		ob[1] = 36;
		ob[2] = 55.55;
		ob[3] = "01/02/2019";
		ob[4] = "Fortworth";
		ob[5] = "LT";
		System.out.println(ob[4]);

	}

}
