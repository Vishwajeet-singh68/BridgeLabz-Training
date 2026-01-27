package functionalinterface;

interface PasswordValidator{
	String passRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!]).{8,}$";
	static boolean validator(String s) {
		return s.matches(passRegex);
	}
}

public class PasswordStringValidator {
	public static void main(String[] args) {
		String password = "Vishu@123";
		
		System.out.println(PasswordValidator.validator(password)?"Valid":"Invalid");
		
	}
}
