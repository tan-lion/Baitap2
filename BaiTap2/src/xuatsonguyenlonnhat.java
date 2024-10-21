import java.util.Scanner;

public class xuatsonguyenlonnhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int m, n;

		// Input
		System.out.println("Nhap gia tri a: ");
		m = sc.nextInt();
		System.out.println("Nhap gai tri b: ");
		n = sc.nextInt();
		
		//Output
		if (m > n) {
			System.out.println("Gia tri lon nhat: " + m);
		} else {
			System.out.println("Gia tri lon nhat: " + n);
		}
	}
}
