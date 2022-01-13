package caculate_next_day;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

class NextDayCalculatorTest {
	
	 @Test
	    void testCalculateNextDay1() {
	        int day = 1;
	        int month = 1;
	        int year = 2018;
	        String expected = "Next day: " + 2 + "-" + 1 + "-" + 2018;
	        String actual = NextDayCalculator.calculateNextDay(day,month,year);
	        assertEquals(expected,actual);
	    }

	    @Test
	    void testCalculateNextDay2() {
	        int day = 31;
	        int month = 1;
	        int year = 2018;
	        String expected = "Next day: " + 1 + "-" + 2 + "-" + 2018;
	        String actual = NextDayCalculator.calculateNextDay(day,month,year);
	        assertEquals(expected,actual);
	    }

	    @Test
	    void testCalculateNextDay3() {
	        int day = 30;
	        int month = 4;
	        int year = 2018;

	        String expected = "Next day: " + 1 + "-" + 5 + "-" + 2018;
	        String actual = NextDayCalculator.calculateNextDay(day,month,year);
	        assertEquals(expected,actual);
	    }

	    @Test
	    void testCalculateNextDay4() {
	        int day = 28;
	        int month = 2;
	        int year = 2018;

	        String expected = "Next day: " + 1 + "-" + 3 + "-" + 2018;
	        String actual = NextDayCalculator.calculateNextDay(day,month,year);
	        assertEquals(expected,actual);
	    }

	    @Test
	    void testCalculateNextDay5() {
	        int day = 29;
	        int month = 2;
	        int year = 2020;

	        String expected = "Next day: " + 1 + "-" + 3 + "-" + 2020;
	        String actual = NextDayCalculator.calculateNextDay(day,month,year);
	        assertEquals(expected,actual);
	    }

	    @Test
	    void testCalculateNextDay6() {
	        int day = 31;
	        int month = 12;
	        int year = 2018;

	        String expected = "Next day: " + 1 + "-" + 1 + "-" + 2019;
	        String actual = NextDayCalculator.calculateNextDay(day,month,year);
	        assertEquals(expected,actual);
	    }


}
