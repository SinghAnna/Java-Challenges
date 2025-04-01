public class ArrayIsPalindrome {
   
        public static void main(String[] args) {
            System.out.println("Welcome to palindrome checker\n");
           int[] numArr  = ArrayUtility.inputArray();
            boolean ispalin = isPalindrome(numArr);
            if (ispalin) {
                System.out.println("your array is palindrome");
            }else{
                System.out.println("your array is not palindrome");
            }
        }
        public static boolean isPalindrome(int[] numArr){
            int i = 0;
            while (i < numArr.length / 2) {
               if (numArr[i] != numArr[(numArr.length -1 )-i]) {
                return false;
               }
             i++;   
            }
            return true;
        }
    }

