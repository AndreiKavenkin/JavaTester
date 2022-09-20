package Lesson5;
import java.io.*;

public class AppData {

    public static void main(String[] args) throws Exception {
        int[][] arr = new int[3][3];
        initArray(arr);
        printArray(arr);
        saveArrayToFile(arr, "src/main/java/lesson5/Test.csv");
        int[][] nArr = loadArrayFromFile("src/main/java/lesson5/Test.csv");
        printArray(nArr);
    }
    private static void initArray(int[][] arr) {
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[0][2] = 32;
        arr[1][0] = 43;
        arr[1][1] = 11;
        arr[1][2] = 73;
        arr[2][0] = 45;
        arr[2][1] = 11;
        arr[2][2] = 72;
    }
      private static void printArray(int[][] arr) {
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(arr[i][j] + " ; ");
              }
              System.out.println();
          }
          System.out.println();
      }
    private static void saveArrayToFile(int[][] arr, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    bw.write(String.valueOf(arr[i][j]) + " ; ");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int[][] loadArrayFromFile(String path) {
        int[][] arr = new int[3][3];
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            for (int i = 0; i < 3; i++) {
                String[] strArr = br.readLine().trim().split(" ");
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = Integer.parseInt(strArr[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

}

