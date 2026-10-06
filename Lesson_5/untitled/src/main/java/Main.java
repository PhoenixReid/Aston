public class Main {
    public static void main(String[] args){
        String[][] matrix1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] matrix2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "abc", "8"},
                {"9", "10", "12" , "10"},
                {"13", "14", "15", "16"}
        };
        String[][] matrix3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "12" , "10"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println(ArrayInInt.ArrayInInt(matrix1));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }  catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(ArrayInInt.ArrayInInt(matrix2));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(ArrayInInt.ArrayInInt(matrix3));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(matrix3[5][5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }



}
