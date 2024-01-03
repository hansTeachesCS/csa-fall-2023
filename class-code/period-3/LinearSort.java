import java.util.Arrays;

public class LinearSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,7,6,3,5,8};
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            // assume smallest is in front
            int minIndex = i;
            int min = arr[i];

            // go search through the values to the right
            for(int j = i+1; j < arr.length; j++) {
                // System.out.println("i: " + arr[i] + " j: " + arr[j]);

                // is there a new smallest number?
                if(arr[j] < min) {
                    // yes, so keep the location of the new smallest
                    minIndex = j;
                } // end if
            } // end inner loop

            // search is done, make the swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    } // end main method
} // end class