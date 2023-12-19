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
        int[] userNumbers = new int[5];
        int userPower = genRandom(1, 26);

        for(int i = 0; i < userNumbers.length; i++) {
            int random = genRandom(1, 69);
            while(!isValid(userNumbers, random)) {
                random = genRandom(1, 69);
            }
            userNumbers[i] = random;
        }

        System.out.println(Arrays.toString(winningNumbers));
        System.out.println(Arrays.toString(userNumbers));

        System.out.println(countMatches(winningNumbers, userNumbers));
    }

    public static boolean isValid(int[] arr, int num) {
        if(num < 1 || num > 69) {
            return false;
        }

        // linear search; is the number already in the array?
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

    public static int countMatches(int[] arr1, int[] arr2) {
        int count = 0;

        // nested enhanced for loops
        for(int i : arr1) {
            for(int j : arr2) {
                if(i == j) {
                    count++;
                }
            }
        }
        return count;
    }
}
