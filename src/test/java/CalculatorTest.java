import calculator.calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    calculator calc = new calculator();

    @Test
    public void squarerootPositive(){
        assertEquals("Square root of an int - Positive",8, calc.sqt(64), DELTA);
        assertEquals("Square root of a double- Positive",2.280350850198276, calc.sqt(5.2), DELTA);
    }

    @Test
    public void squarerootNegative(){
        assertNotEquals("Square root of an int - Negative",2,calc.sqt(10), DELTA);
        assertNotEquals("Square root of a Double- Negative", 5.7, calc.sqt(37),DELTA);
    }

    @Test
    public void factorialPositive(){
        assertEquals("Factorial of an int - Positive",120,calc.factorial(5), DELTA);
        assertEquals("Factorial of a double - Positive",5040,calc.factorial(7.0), DELTA);
    }

    @Test
    public void factorialNegative(){
        assertNotEquals("Factorial of an int - Negative",120,calc.factorial(9), DELTA);
        assertNotEquals("Factorial of a double - Negative",720,calc.factorial(7.0), DELTA);
    }

    @Test
    public void logPositive(){
        assertEquals("Log- Positive",1.9459101490553132,calc.log(7),DELTA );
        assertEquals("Log - Positive",1.3862943611198906,calc.log(4),DELTA );
        assertEquals("Log - Positive", 0, calc.log(1), DELTA );
    }

    @Test
    public void logNegative(){
        assertNotEquals("Log- Positive",1,calc.log(10),DELTA );
        assertNotEquals("Log - Positive",1,calc.log(23),DELTA );
    }

    @Test
    public void powerPositive(){
        assertEquals("Power of two int - Positive",16,calc.power(2,4),DELTA);
        assertEquals("Power of an int and double - Positive",29.791000000000004,calc.power(3.1,3),DELTA);
        assertEquals("Power of two doubles - Positive",65.28280246512092,calc.power(3.3,3.5),DELTA);
    }

    @Test
    public void powerNegative(){
        assertNotEquals("Power of two doubles - Positive",-1,calc.power(1,3),DELTA);
        assertNotEquals("Power of an int and double - Negative",9,calc.power(-3.3,3),DELTA);
        assertNotEquals("Power of two int - Negative",-1,calc.power(-7,10),DELTA);
    }
    
        @Test
    public void ProductPositive(){
        assertEquals("Product of two int - Positive",8,calc.multiply(2,4),DELTA);
        assertEquals("Product of an int and double - Positive",6.2,calc.multiply(3.1,2),DELTA);
        assertEquals("Product of two doubles - Positive",1.44,calc.multiply(1.2,1.2),DELTA);
    }

    @Test
    public void ProductNegative(){
        assertNotEquals("Product of two doubles - Positive",-1,calc.multiply(1,3),DELTA);
        assertNotEquals("Product of an int and double - Negative",9,calc.multiply(-3.3,3),DELTA);
        assertNotEquals("Product of two int - Negative",-1,calc.multiply(-7,10),DELTA);
    }
}
