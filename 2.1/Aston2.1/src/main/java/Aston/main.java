package Aston;
//выполненно Пентюшенков Артём
import java.time.LocalDate;
import java.util.Arrays;

public class main {

    public static void main(String[] args){

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(checkSum(2, 5));

        checkSing(7);

        System.out.println(checkBooleanSing(-3));

        printStringln("Привет мой друг", 3);

        System.out.println(LeapYearChecker(2100));

        System.out.println(Arrays.toString(massivInversion(new int[]{1, 0, 1, 0, 0})));

        System.out.println(Arrays.toString(fillingMassiv()));

        multiplyMassiv();

        matrixDiagonal();

        System.out.println(Arrays.toString(matrixCompletion(7,3)));
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 18;
        int b = 7;
        if (a+b >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 57;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зелёный");
        } else {
            System.out.println("Жёлтый");

        }
    }

    public static void compareNumbers(){
        int a = 8;
        int b = 17;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int a, int b){
        if (a+b >= 10 && a+b <= 20){
            return true;
        } else {
            return false;
        }
    }

    public static void checkSing(int a){
        if (a < 0){
            System.out.println("Отрицательное значение");
        } else if(a >= 0) {
            System.out.println("Положительное значение");
        }
    }

    public static boolean checkBooleanSing(int a){
        if (a < 0){
            return true;
        } else {
            return false;
        }
    }

    public static void printStringln(String stroka, int a){
        for(int i = 0; i < a; i++){
            System.out.println(stroka);
        }
    }

    public static boolean LeapYearChecker(int year){
        LocalDate date = LocalDate.of(year, 1, 1);
        return date.isLeapYear();

    }

    public static int[] massivInversion(int[] mass){
        for (int i = 0 ; i < mass.length ; i++){
            if(mass[i] == 0){
                mass[i] = 1;
            }else if (mass[i] == 1){
                mass[i] = 0;
            } else{
                System.out.println("Значение не равно 1 или 0");
            }
        }
        return mass;
    }
    public static int[] fillingMassiv(){
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
        }
        return numbers;
    }

    public static void multiplyMassiv(){
        int[] numbers = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for( int i = 0; i < numbers.length; i++ ){
            if(numbers[i] < 6){
                numbers[i] = numbers[i]*2;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void matrixDiagonal(){
        int size = 7;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < a; i++){
            matrix[i][i] = 1;
            matrix[i][size-1-i]=1;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int[] matrixCompletion(int len, int initialValue){
        int[] matrix = new int[len];
        for (int i = 0; i < len;i++ ){
            matrix[i] = initialValue;
        }
        return matrix;
    }


}
