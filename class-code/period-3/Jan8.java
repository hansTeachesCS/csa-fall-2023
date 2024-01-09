import java.util.Arrays;

public class Jan8 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(genArray(5, 10)));
        System.out.println(Arrays.toString(genArray(11, 18)));
        System.out.println(Arrays.toString(genArray(-5, 10)));
    }

    public static int[] genArray(int start, int end) {
        int len = end - start;
        int[] result = new int[len];

        for(int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }
        return result;
    }
}