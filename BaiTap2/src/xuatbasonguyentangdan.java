import java.util.Scanner;

public class xuatbasonguyentangdan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int a, b, c, temp;

		// Input
		System.out.println("Nhap gia tri a: ");
		a = sc.nextInt();
		System.out.println("Nhap gia tri b: ");
		b = sc.nextInt();
		System.out.println("Nhap gia tri c: ");
		c = sc.nextInt();

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
		System.out.println("Thu tu tang dan: " + a + ", " + b + ", " + c);
	}
}
