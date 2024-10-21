import java.util.Scanner;

public class inratennguoisudungmay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		String character, name = "";

		// Input (B= Bo, H= Me, A= A trai, E= E gai, G= Girl)
		System.out.println("Ai dang su dung may: ");
		character = sc.nextLine();

		switch (character) {
		case "B":
			name = "Bo";
			break;
		case "H":
			name = "Me";
			break;
		case "A":
			name = "A trai";
			break;
		case "E":
			name = "E gai";
			break;
		case "G":
			name = "Girl";
			break;

		default:
			break;
		}

		// Output
		System.out.println("Hello: " + name);
	}
}
