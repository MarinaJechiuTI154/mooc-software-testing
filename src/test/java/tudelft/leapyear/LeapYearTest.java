package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
   LeapYear leap ;

   @BeforeEach
    void initilize(){
       leap = new LeapYear();
   }

   @Test
    void leapYeardivisibleby4notBy100(){
       boolean isLeap = leap.isLeapYear(2016);
       Assertions.assertTrue(isLeap);
   }
   @Test
   void leapDivisibleBy100and400(){
       boolean isLeap = leap.isLeapYear(1600);
       Assertions.assertTrue(isLeap);
   }
   @Test
    void leapYearDivisibleBy4and100ButNot400(){
       boolean isLeap = leap.isLeapYear(1800);
       Assertions.assertFalse(isLeap);
   }
   @Test
    void leapYearNotDivisibleBy4(){
       boolean isLeap = leap.isLeapYear(2003);
       Assertions.assertFalse(isLeap);
   }
}
