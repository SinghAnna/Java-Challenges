import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter the number of elements: ");
       int size = input.nextInt();
       int[] nums = new int[size];
       int i = 0;

       while (i < size) {
        System.out.print("Please enter element on " + (i+1) +": ");
        nums[i] = input.nextInt();
        i++;
       }
       return nums;
    }

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columms= input.nextInt();
        int[][] numArray = new int[row][columms];
        int i = 0;
 
        while (i < row) {
            int j = 0;
            while (j < columms) {
                System.out.print("Please enter element rows" + (i+1) +": "
                + ", columns: " +(j+1) +" :  ");
                numArray[i][j] = input.nextInt();
                j++;
            }
         
         i++;
        }
        return numArray;
     }

    public static void displayArray(int[] numarr){
        int i = 0;
        while (i < numarr.length) {
            System.out.print(numarr[i] + " ");
            i++;
        }
        System.out.println();
    } 



}

