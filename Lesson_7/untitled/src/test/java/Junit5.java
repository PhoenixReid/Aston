import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import Exception.*;
public class Junit5 {

    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "5, 120" , "10, 3628800"})
    public void factorialTest(int number, int result) throws FactorialException {
        Assertions.assertEquals(Program.factorial(number), result);
    }

    @Test
    public void factorialExceptionTest() throws FactorialException{
        Assertions.assertThrows( FactorialException.class, ()->Program.factorial(-1));
    }

    @ParameterizedTest
    @CsvSource({"10, 10, 10, 43", "8.5, 9.3, 7.7, 31", "5, 5, 6.7, 12"})
    public void areaTest(double side1,double side2, double side3, int result) throws NegativeSideException {
        Assertions.assertEquals(Program.area(side1, side2, side3), result);
    }

    @ParameterizedTest
    @CsvSource({"-10, 10, 10", "8.5, -9.3, 7.7", "5, 5, -6.7", "0, 1, 5", "5, 0, 3", "7, 7, 0", "-13, -7, -2", "0, 0, 0"})
    public void areaExceptionTest(double side1,double side2, double side3) throws NegativeSideException{
        Assertions.assertThrows( NegativeSideException.class, ()->Program.area(side1, side2, side3));
    }

    @ParameterizedTest
    @CsvSource({"5, 5, *, 25", "-5, 6, *, -30", "3, 7, +, 10", "-3, 7, +, 4", "10, 5, -, 5", "5, -10, -, 15", "5, 10, -, -5", "5, 3, /, 1", "10, 2, /, 5"})
    public void calculatorTest(int number1, int number2, String operation, int result) throws DivisionZeroException, InvalidOperatorException{
        Assertions.assertEquals(Program.calculator(number1, number2, operation),result);
    }

    @Test
    public void calculatorDivisionExceptionTest() throws DivisionZeroException, InvalidOperatorException{
        Assertions.assertThrows(DivisionZeroException.class, ()->Program.calculator(5, 0, "/"));
    }

    @Test
    public void calculatorOperationExceptionTest() throws DivisionZeroException, InvalidOperatorException{
        Assertions.assertThrows(InvalidOperatorException.class, ()->Program.calculator(5,0, "==" ));
    }

    @ParameterizedTest
    @CsvSource({"10, 7, 10 больше 7", "7, 10, 7 меньше 10", "10, 10, Равны","-10, 0, -10 меньше 0", "7, -10, 7 больше -10", "-15, -15, Равны"})
    public void comparisonTest(int number1, int number2, String result){
        Assertions.assertEquals(Program.comparison(number1, number2), result);
    }

}
