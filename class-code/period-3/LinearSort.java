import java.util.Arrays;

public class LinearSort {
    public static void main(String[] args) {
        // int[] arr = {2,4,1,7,6,3,5,8};
        // System.out.println(Arrays.toString(arr));

        int[] arrRand = new int[20];
        for(int i = 0; i < arrRand.length; i++) {
            arrRand[i] = (int)(Math.random()*10 + 1);
        }
        System.out.println(Arrays.toString(arrRand));

        // NO GOOD! NO KEEPING TRACK OF INDEX
        // for(int val : arrRand) {
        //     arrRand[] = 
        // }

        for(int i = 0; i < arrRand.length; i++) {
            // assume smallest is in front
            int minIndex = i;
            int min = arrRand[i];

            // go search through the values to the right
            for(int j = i+1; j < arrRand.length; j++) {
                // System.out.println("i: " + arr[i] + " j: " + arr[j]);

                // is there a new smallest number?
                if(arrRand[j] < min) {
                    // yes, so keep the location of the new smallest
                    minIndex = j;
                    // update what the new min is
                    min = arrRand[j];
                } // end if
            } // end inner loop

            // search is done, make the swap
            int temp = arrRand[i];
            arrRand[i] = arrRand[minIndex];
            arrRand[minIndex] = temp;
            // System.out.println(Arrays.toString(arrRand));
        }
        System.out.println(Arrays.toString(arrRand));
    } // end main method
} // end class