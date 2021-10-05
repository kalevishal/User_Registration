import java.util.Scanner;

public class UserRegex {
	public static void main(String[] args) {

		

		Scanner scan = new Scanner(System.in);
		 String passwordRegexRule1= "[!\"#$%&'()*+,-./:;<=>?@\\^_`{|}~A-Za-z0-9]{8,15}+";
	        System.out.println("Enter the password with minimum 8 characters!!!");
	        String password = scan.next();
	        System.out.println("Is the password valid ? : "+password.matches(passwordRegexRule1));

	}

}