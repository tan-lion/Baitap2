import java.util.Scanner;

public class inracachdocso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int number;
		String a = "", b = "";

		// Input
		System.out.println("Nhap gia tri so nguyen (2 so): ");
		number = sc.nextInt();

		switch (number / 10) {
		case 1:
			a = "Mười";
			break;
		case 2:
			a = "Hai";
			break;
		case 3:
			a = "Ba";
			break;
		case 4:
			a = "Bốn";
			break;
		case 5:
			a = "Năm";
			break;
		case 6:
			a = "Sáu";
			break;
		case 7:
			a = "Bảy";
			break;
		case 8:
			a = "Tám";
			break;
		case 9:
			a = "Chín";
			break;

		default:
			break;
		}

		switch (number % 10) {
		case 0:
			if (number / 10 > 1) {
				b = "Mươi";
			} else if (number / 10 == 0) {
				b = "Không";
			}
			break;

		case 1:
			if (number / 10 == 1 || number / 10 == 0) {
				b = "Một";
			} else {
				b = "Mốt";
			}
			break;

		case 2:
			b = "Hai";
			break;
		case 3:
			b = "Ba";
			break;
		case 4:
			b = "Bốn";
			break;
		case 5:
			if (number / 10 == 0) {
				b = "Năm";
			} else {
				b = "Lăm";
			}
			break;
		case 6:
			b = "Sáu";
			break;
		case 7:
			b = "Bảy";
			break;
		case 8:
			b = "Tám";
			break;
		case 9:
			b = "Chin";
			break;

		default:
			break;
		}
		
		//Output
		System.out.println("Cach doc 2 so nguyen: " + a + " " + b);
	}
}
