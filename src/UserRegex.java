import java.util.Scanner;

public class UserRegex {
	public static void main(String[] args) {

		

		Scanner scan = new Scanner(System.in);
			String passwordRegexRule4= "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(.[*.!@$%^&(){}:;<>,.?/~_+-=|]).{8,32}$";
	        System.out.println("Enter the password with minimum 8 characters!!!");
	        String password = scan.next();
	        System.out.println("Is the password valid ? : "+password.matches(passwordRegexRule4));

	}

}