package fizz_buzz;

public class FizzBuzzTranslate {
	public static String translate(int number) {
		boolean isFizz = number % 3 == 0;
		boolean isBuzz = number % 5 == 0;

		if (isFizz && isBuzz)
			return "FizzBuzz";
		if (isFizz)
			return "Fizz";

		if (isBuzz)
			return "Buzz";
		int testNumber=number;
		while (testNumber > 2) {
			isFizz = number % 10 == 3;
			isBuzz = number % 10 == 5;
			if (isFizz)
				return "Fizz";

			if (isBuzz)
				return "Buzz";
			testNumber/=10;

		}

		return number + "";
	}

}
