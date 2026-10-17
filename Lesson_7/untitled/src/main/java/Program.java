import Exception.*;

public class Program {

    public static int factorial(int number) throws FactorialException {
        int factorial = 1;
        if (number == 0){
            return 1;
        } else if (number < 0) {
        throw new FactorialException();
        }else {
        for (int i = 1; i <= number; i++){
            factorial = factorial*i;
        }
            return factorial;
        }
    }

    public static double area(double side1, double side2, double side3) throws NegativeSideException{
        if (side1 <=0 || side2 <=0 || side3 <= 0){
            throw new NegativeSideException();
        } else {
            double halfMeter = (side1 + side2 + side3)/2;
            double area = Math.round(Math.sqrt(halfMeter*(halfMeter-side1)*(halfMeter-side2)*(halfMeter-side3)));
            return area;
        }
    }

    public static int calculator(int number1, int number2, String operation) throws DivisionZeroException, InvalidOperatorException{
        switch (operation){
            case "*":
                return number1 * number2;
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "/":
                if (number2 == 0){
                    throw new DivisionZeroException();
                }else {
                    return number1 / number2;
                }
            default:
                throw new InvalidOperatorException();
        }
    }

    public static String comparison(int number1, int number2){
        if (number1 < number2){
            return  number1 + " меньше " + number2;

        } else if (number1 == number2) {
            return "Равны";
        } else {
            return  number1 + " больше " + number2;

        }
    }
}
