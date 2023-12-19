import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("powerball simulator!");
        int[] winningNumbers = new int[5];
        int winningPower = drawRandom(1, 26);

        for(int i = 0; i < 5; i++) {
            int whiteBall = drawRandom(1, 69);
            while(!isValid(winningNumbers, whiteBall)) {
                whiteBall = drawRandom(1, 69);
            }
            winningNumbers[i] = whiteBall;
        }

        int[] userNumbers = new int[5];
        int userPower = drawRandom(1, 26);

        for(int i = 0; i < 5; i++) {
            int whiteBall = drawRandom(1, 69);
            while(!isValid(userNumbers, whiteBall)) {
                whiteBall = drawRandom(1, 69);
            }
            userNumbers[i] = whiteBall;
        }
        System.out.println(Arrays.toString(winningNumbers));
        System.out.println(Arrays.toString(userNumbers));
        System.out.println(countMatches(winningNumbers, userNumbers));
        
    }

    public static int drawRandom(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static boolean isValid(int[] arr, int num) {
        // is the number in range?
        if (num < 1 || num > 69) {
            return false;
        }
        // is the number already in the list?
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return false;
            }
        }
        // if we get here, then it's a valid number
        return true;
    }

    public static int countMatches(int[] arr1, int[] arr2) {
        int count = 0;
        
        // enhanced for loops
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