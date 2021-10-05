import java.util.Scanner;

public class UserRegex {
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		
		String lastName="^[A-Z][a-zA-Z]{2,20}";
		System.out.println("Enter a name with minimum three alphabets");
		 String name = Scan.next();
		System.out.println("Is the input name valid ? : "+name.matches(lastName));
				        
	}

}