import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegex {
	public static void main(String[] args) {

		

		Scanner scan = new Scanner(System.in);
        String number= "91 9876543210";

        String numberRegex = "[0-9]{1}[0-9]{1}\\s{0,1}[7-9]{1}[0-9]{9}";
        System.out.println("Enter your contact number");
        String contact = scan.nextLine();
        Pattern pattern = Pattern.compile(numberRegex);     
        Matcher matcher = pattern.matcher(contact);
        System.out.println("Is Valid ? : "+matcher.matches());

	}

}