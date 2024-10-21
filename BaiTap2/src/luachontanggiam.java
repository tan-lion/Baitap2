import java.util.Scanner;

public class luachontanggiam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int a, b, c, temp, option;

		// Input
		System.out.println("Nhap gia tri a: ");
		a = sc.nextInt();
		System.out.println("Nhap gia tri b: ");
		b = sc.nextInt();
		System.out.println("Nhap gia tri c: ");
		c = sc.nextInt();

		System.out.println("Nhap lua chon ban muon (1 tang, 2 giam): ");
		option = sc.nextInt();

		switch (option) {
		case 1:
			if (a > b) {
				temp = a;
				a = b;
				b = temp;
			}

			if (a > c) {
				temp = a;
				a = c;
				c = temp;
			}

			if (b > c) {
				temp = b;
				b = c;
				c = temp;
			}
			// Output
			System.out.println("Thu tu tang: " + a + ", " + b + ", " + c);
			break;

		case 2:
			if (a < b) {
				temp = a;
				a = b;
				b = temp;
			}

			if (a < c) {
				temp = a;
				a = c;
				c = temp;
			}

			if (b < c) {
				temp = b;
				b = c;
				c = temp;
			}
			// Output
			System.out.println("Thu tu giam: " + a + ", " + b + ", " + c);
			break;

		default:
			break;
		}
	}
}
