import java.util.Scanner;

public class Search_2D_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D Search\n");
        int[][]  numArr = ArrayUtility.input2DArray();
        System.out.println("Now , Enter the number you want to search:  "); 
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if (isFound) {
            System.out.println("your number was found.");
        }else {
            System.out.println("your number is not found.");
        }

    }

     public static boolean search(int[][] numArr, int num){
        int i = 0;
        System.out.println("number of row "+numArr.length);
        System.out.println( "number of columns " +numArr[i].length);
        while (i < numArr.length) {

            int j = 0;
            while (j < numArr[i].length) {
                if (numArr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }

        return false;
     }
}
