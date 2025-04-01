public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome toArray Sorting Check post\n");
        int[] numarr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numarr);
        boolean isDec = isDecreasing(numarr);
        if (isInc) {
            System.out.println("your array is sorted in increasing forms");
        } else if (isDec) {
            System.out.println("your array is sorted in decreasing forms");
        } else {
            System.out.println("your array is not sorted");
        }
    }

    public static boolean isDecreasing(int[] numarr) {
        int i = 1;
        while (i < numarr.length) {
            if (numarr[i] > numarr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;

    }

    public static boolean isIncreasing(int[] numarr) {
        int i = 1;
        while (i < numarr.length) {
            if (numarr[i] < numarr[i - 1]) {
                return false;
            }
            i++;
        }

        return true;
    }
}
