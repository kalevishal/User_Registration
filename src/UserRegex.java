import java.util.Scanner;

public class UserRegex {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Enter your email");
		String email = Scan.next();
		String emailRegex = "^[a-zA-Z0-9+_.]+@[a-zA-Z.-]+$";
		System.out.println("Is the above email valid : " + email.matches(emailRegex));
	}

}