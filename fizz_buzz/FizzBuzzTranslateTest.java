package fizz_buzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTranslateTest {

	@Test
    void testTranslate3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
	@Test
    void testTranslate4() {
        int number = 13;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
    void testTranslate5() {
        int number = 16;
        String expected = "16";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testTranslate6() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
    

    @Test
    void testBuzz5() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz10() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testTranslateBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testTranslateBuzz30() {
        int number = 30;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

}
