import java.util.Arrays;

public class Mode {
    public static void main(String[] args) {
        int[] ratings = new int[100];
        for(int i = 0; i < ratings.length; i++) {
            ratings[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(ratings));
        System.out.println(getMode(ratings));
    }

    public static int getMode(int[] arr) {
        int mode = -1;
        // System.out.println(getMax(arr));

        int[] freq = new int[getMax(arr)+1];

        for(int value : arr) {
            freq[value]++;
        }
        System.out.println(Arrays.toString(freq));

        int max = -1;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > max) {
                max = freq[i];
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