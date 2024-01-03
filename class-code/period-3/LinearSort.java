import java.util.Arrays;

public class LinearSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,6,3,5,8};
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            // assume smallest is in front
            int minIndex = i;
            int min = arr[i];
            for(int j = i+1; j < arr.length; j++) {
                // System.out.println("i: " + arr[i] + " j: " + arr[j]);
                if(arr[j] < min) {
                    minIndex = j;
                } // end if
            } // end inner loop
            // make the swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    } // end main method
} // end class