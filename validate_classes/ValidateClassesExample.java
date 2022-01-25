package validate_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassesExample {
	private static final String CLASSES_REGEX = "^[CAP]\\d{4}[GHIKLM]$";
	public static final String[] validName = new String[] { "C0318G","A2221M","P4444G" };
	public static final String[] invalidName = new String[] { "M0318G", "P0323A" };

	public static boolean validate(String regex) {
		Pattern pattern = Pattern.compile(CLASSES_REGEX);
		Matcher  matcher = pattern.matcher(regex);
		return matcher.matches();
	}

	public static void main(String[] args) {
		for (String name : validName) {
			boolean isvalid = validate(name);
			System.out.println("Account is " + name +" is valid: "+ isvalid);
		}
		for (String name : invalidName) {
			boolean isvalid = validate(name);
			System.out.println("Account is " + name +" is valid: "+ isvalid);
		}

	}

}
