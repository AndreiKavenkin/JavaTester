package Lesson2;

public class Isklyucheniye {
    public static void main(String[] args) {
        String[][] massive = new String[][]{
                {"11", "12", "13", "14"},
                {"21", "22", "23", "24"},
                {"31", "32", "33", "34"},
                {"41", "42", "43", "44"}};
        try {
            try {
                int result = intsumma(massive);
                System.out.println(result);
            } catch (MyArraySizeException a) {
                System.out.println("Неверный размер массива!");
            }
        }
        catch (MyArrayDataException a) {
            System.out.println("Неверное значение в массиве находится в ячейке: [" + a.i + "x" + a.j+"]");
        }
    }
    public static int intsumma(String[][] massive) throws MyArraySizeException, MyArrayDataException {
        int b = 0;
        if (massive.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < massive.length; i++) {
            if (massive[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < massive[i].length; j++) {
                try {
                    b = b + Integer.parseInt(massive[i][j]);
                }
                catch (NumberFormatException a) {
                    throw new MyArrayDataException(i+1, j+1);
                }
            }
        }
        return b;
    }
}
