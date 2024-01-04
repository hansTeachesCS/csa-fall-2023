import java.util.Arrays;

public class LinearSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,6,3,5,8};
        System.out.println(Arrays.toString(arr));
        
        for(int i = 0; i < arr.length; i++) {
            // assume the min is in the front
            int min = arr[i];
            int minIndex = i;

            // search the remaining values to find actual min
            for(int j = i+1; j < arr.length; j++) {
                // System.out.println("i: " + arr[i] + " j: " + arr[j]);
                // find the min value
                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            } // end inner for loop
            // swap
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;

            // System.out.println("when i is: " + i + " min is: " + min);
        }
        System.out.println(Arrays.toString(arr));
    } // end main method
} // end class