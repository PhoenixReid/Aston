
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import Exception.*;
import org.testng.annotations.Test;

public class TestNG {
    @DataProvider(name = "factorialData")
    public Object[][] factorialData() {
        return new Object[][] {
            {0, 1},
            {1, 1},
            {5, 120}
        };
    }

    @DataProvider(name = "areaData")
    public Object[][] areaData() {
        return new Object[][] {
                {10.0, 10.0, 10.0, 43},
                {8.5, 9.3, 7.7, 31},
                {5.0, 5.0, 6.7, 12}
        };
    }

    @DataProvider(name = "areaExceptionData")
    public Object[][] areaExceptionData(){
        return new Object[][]{
                {-10.0, 10.0, 10.0},
                {8.5, -9.3, 7.7},
                {5.0, 5.0, -6.7},
                {0.0, 1.0, 5.0},
                {5.0, 0.0, 3.0},
                {7.0, 7.0, 0.0},
                {-13.0, -7.0, -2.0},
                {0.0, 0.0, 0.0}
        };
    }
    @DataProvider (name = "calculatorData")
    public Object[][] calculatorData(){
        return new Object[][] {
                {5, 5, "*", 25},
                {-5, 6, "*", -30},
                {3, 7, "+", 10},
                {-3, 7, "+", 4},
                {10, 5, "-", 5},
                {5, -10, "-", 15},
                {5, 10, "-", -5},
                {5, 3, "/", 1},
                {10, 2, "/", 5}
        };
    }

    @DataProvider (name = "comparisonData")
    public Object[][] comparisonData(){
        return new Object[][] {
                {10, 7, "10 больше 7"},
                {7, 10, "7 меньше 10"},
                {10, 10, "Равны"},
                {-10, 0, "-10 меньше 0"},
                {7, -10, "7 больше -10"},
                {-15, -15, "Равны"}
        };
    }


    @Test(dataProvider = "factorialData" )
    public void factorialTest(int number, int result) throws FactorialException {
        Assert.assertEquals(Program.factorial(number), result);
    }

    @Test
    public void factorialExceptionTest() throws FactorialException{
        Assert.assertThrows( FactorialException.class, ()->Program.factorial(-1));
    }

    @Test(dataProvider = "areaData")
    public void areaTest(double side1, double side2, double side3, int result) throws NegativeSideException{
        Assert.assertEquals(Program.area(side1,side2,side3), result);
    }

    @Test(dataProvider = "areaExceptionData")
    public void areaExceptionTest(double side1, double side2, double side3) throws NegativeSideException{
        Assert.assertThrows(NegativeSideException.class,()->Program.area( side1, side2, side3));
    }

    @Test(dataProvider = "calculatorData")
    public void calculatorTest(int number1, int number2, String operation, int result) throws DivisionZeroException, InvalidOperatorException{
        Assert.assertEquals(Program.calculator(number1, number2, operation), result);
    }

    @Test
    public void calculatorDivisionExceptionTest() throws DivisionZeroException, InvalidOperatorException{
        Assert.assertThrows(DivisionZeroException.class, ()->Program.calculator(5, 0, "/"));
    }

    @Test
    public void calculatorOperationExceptionTest() throws DivisionZeroException, InvalidOperatorException{
        Assert.assertThrows(InvalidOperatorException.class, ()->Program.calculator(5, 5, "=="));


    }

    @Test (dataProvider = "comparisonData")
    public void comparisonTest(int number1, int number2, String result){
        Assert.assertEquals(Program.comparison(number1, number2), result);
    }
}