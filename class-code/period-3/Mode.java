import java.util.Arrays;

public class Mode {
    public static void main(String[] args) {
        int[] ratings = {7, 9, 10, 9, 4, 10, 10, 8, 9, 10, 9};

        System.out.println(getMode(ratings) + " is the mode.");
    }

    public static int getMode(int[] arr) {
        int mode = -1;
        int max = getMax(arr);
        // System.out.println(max);

        int[] freq = new int[max+1];
        for(int value : arr) {
            freq[value]++;
        }
        // System.out.println(Arrays.toString(freq));

        int maxFreq = 0;
        // visit each value in the array, we need index
        // so no enhanced for loop
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                // the mode is the index value of the largest num
                mode = i;
            }
        }

        return mode;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int value : arr) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
}