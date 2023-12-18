import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int[] winningNumbers = new int[5];
        int winningPower = genRandom(1, 26);

        for(int i = 0; i < winningNumbers.length; i++) {
            int random = genRandom(1, 69);
            while(!isValid(winningNumbers, random)) {
                random = genRandom(1, 69);
            }
            winningNumbers[i] = random;
        }
        System.out.println(Arrays.toString(winningNumbers));
    }

    public static boolean isValid(int[] arr, int num) {
        if(num < 1 || num > 69) {
            return false;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return false;
            }
        }
        return true;
    }

    public static int genRandom(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
