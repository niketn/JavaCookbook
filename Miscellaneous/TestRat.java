package pacrical;

import java.util.Scanner;

class Rational {
	int x, y;
	static int i = 0;

	Rational() {
		x = 0;
		y = 1;
		i++;
	}

	Rational(int x, int y) {
		this.x = x;
		this.y = y;
		i++;
	}

	public static int getGCD(int a, int b) {
		if (a < 0)
			a = -a;
		if (b < 0)
			b = -b;
		if (a == 0 || b == 0)
			return (0);
		else if (a == b)
			return (a);
		else if (a > b)
			return (getGCD(a - b, b));
		return (getGCD(a, b - a));
	}

	public void reduceLowest() {
		int temp = getGCD(x, y);
		if (temp == 0)
			return;
		x = x / temp;
		y = y / temp;
	}

	Rational add(Rational r) {
		Rational rn = new Rational();
		rn.x = x * r.y + r.x * y;
		rn.y = r.y * y;
		rn.reduceLowest();
		return (rn);
	}

	Rational sub(Rational r) {
		Rational rn = new Rational();
		rn.x = x * r.y - r.x * y;
		rn.y = r.y * y;
		rn.reduceLowest();
		return (rn);
	}

	Rational mul(Rational r) {
		Rational rn = new Rational();
		rn.x = x * r.x;
		rn.y = r.y * y;
		rn.reduceLowest();
		return (rn);
	}

	Rational div(Rational r) {
		Rational rn = new Rational();
		rn.x = x * r.y;
		rn.y = r.x * y;
		rn.reduceLowest();
		return (rn);
	}

	void absolute() {
		if (x < 0)
			if (y > 0)
				x = -x;
		if (y < 0)
			if (x > 0)
				y = -y;
	}

	float fltPoint() {
		return ((float) x / y);
	}

	public String toString() {
		if (x < 0 && y < 0)
			return (" " + (-x) + "/" + (-y));
		if (x < 0 && y > 0)
			return ("-" + (-x) + "/" + (y));
		if (x > 0 && y < 0)
			return ("-" + (x) + "/" + (-y));
		return ("" + x + "/" + y);
	}
}

class ObjCount extends Exception {
	ObjCount(String str) {
		super(str);
	}
}

public class TestRat {
	static int x, y;

	public static void getData() {
		Scanner s = new Scanner(System.in);
		int r, ey;

		System.out.println("enter rational number");
		System.out.println("enter x:");
		x = s.nextInt();

		ey = 1;

		while (ey == 1) {
			System.out.println("enter y:");
			y = s.nextInt();
			try {
				r = x / y;
				break;
			} catch (Exception e) {
				System.out.println("Divide by zero exception since y=0.\nenter y again");
				ey = 1;
			}

		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int ch;
		char c;
		Rational r1, r2, r3;

		do {
			System.out.print("Enter:\n1.to ADD\n2.to SUBTRACT\n3.to MULTIPLY\n4.to DIVIDE\n5.to FIND ABSOLUTE VALUE");
			System.out.print("\n6 TO FIND FLOATING POINT EQ\nENTER YOUR CHOICE: ");
			ch = s.nextInt();

			switch (ch) {
			case 1:
				getData();
				try {
					r1 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				getData();

				try {
					r2 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}

				try {
					r3 = r1.add(r2);
					System.out.print("Result: " + r3.toString());
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				break;

			case 2:
				getData();
				try {
					r1 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				getData();

				try {
					r2 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}

				try {
					r3 = r1.sub(r2);
					System.out.print("Result: " + r3.toString());
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				break;

			case 3:
				getData();
				try {
					r1 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				getData();

				try {
					r2 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}

				try {
					r3 = r1.mul(r2);
					System.out.print("Result: " + r3.toString());
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				break;

			case 4:
				getData();
				try {
					r1 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				getData();

				try {
					r2 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}

				try {
					r3 = r1.div(r2);
					System.out.print("Result: " + r3.toString());
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				break;
			case 5:
				getData();
				try {
					r1 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.print("Number: " + r1.toString());
				r1.absolute();
				System.out.print("\nAbsolute Value: " + r1.toString());
				break;

			case 6:
				getData();

				try {
					r1 = new Rational(x, y);
					if (Rational.i > 50)
						throw (new ObjCount("Count 50 Exceeded"));
				} catch (ObjCount e) {
					System.out.println(e.getMessage());
					break;
				}
				System.out.print("Number: " + r1.toString());
				System.out.print("\nFloating Point Equivalent: " + r1.fltPoint());
				break;

			}

			System.out.println("\ndo you wish to enter another rational number ? (Y/N):");
			String st = s.next();
			c = st.charAt(0);
		} while ((c == 'Y' || c == 'y') && Rational.i < 50);

	}

}
