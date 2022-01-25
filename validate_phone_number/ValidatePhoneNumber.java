package validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
	private static final String CLASSES_REGEX = "^\\(\\d{2}\\)-\\(0[0-9]{9}\\)$";
	public static final String[] validName = new String[] { "(84)-(0978489648)","(84)-(0978489148)","(84)-(0078489648)" };
	public static final String[] invalidName = new String[] { "(a8)-(22222222)", "(a8)-(022a22222)" };

	public static boolean validate(String regex) {
		Pattern pattern = Pattern.compile(CLASSES_REGEX);
		Matcher  matcher = pattern.matcher(regex);
		return matcher.matches();
	}

	public static void main(String[] args) {
		for (String name : validName) {
			boolean isvalid = validate(name);
			System.out.println("Phone is " + name +" is valid: "+ isvalid);
		}
		for (String name : invalidName) {
			boolean isvalid = validate(name);
			System.out.println("Phone is " + name +" is valid: "+ isvalid);
		}

	}

}
