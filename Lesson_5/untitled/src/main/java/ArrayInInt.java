public class ArrayInInt {
    public static int ArrayInInt(String[][] matrix) throws MyArraySizeException,InvalidNumberException {
        int summa = 0;
        if(matrix.length != 4){
            throw new MyArraySizeException();
        }

        for(int i = 0; i < 4; i++){
            if (matrix[i].length != 4){
                throw new MyArraySizeException();
            }
        }

        for(int i = 0; i < 4; i++){
            for(int y = 0; y < 4; y++){
                try {
                    Integer.valueOf(matrix[i][y]);
                }catch (NumberFormatException e){
                    throw new InvalidNumberException("Строка " + (i + 1) + " столбец " + (y + 1) + " содержит некоректные данные: " + matrix[i][y]);
                }

                summa = summa + Integer.valueOf(matrix[i][y]);
            }
        }
        return summa;
    }
    }
