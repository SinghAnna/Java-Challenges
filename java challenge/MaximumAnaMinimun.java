public class MaximumAnaMinimun {
    public static void main(String[] args) {
        System.out.println("Welcome to Max And Min\n");
        int[] numarr = ArrayUtility.inputArray();
        int max = max(numarr);
        int min = min(numarr);
        System.out.println("Max of the Array is " + max);
        System.out.println("Min of the Array is " + min);
    }

    public static int min(int[] numarr) {
        int min = Integer.MAX_VALUE;

        int i = 0;
        while (i < numarr.length) {
            if (min > numarr[i]) {
                min = numarr[i];
            }
            i++;
        }

        return min;
    }

    public static int max(int[] numarr) {
        if (numarr.length == 0) {
            return Integer.MIN_VALUE;

        }
        int max = numarr[0];
        int i = 1;
        while (i < numarr.length) {
            if (max < numarr[i]) {
                max = numarr[i];
            }
            i++;
        }
        return max;
    }
}
