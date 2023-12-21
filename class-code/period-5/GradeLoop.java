public class GradeLoop {
    public static void main(String[] args) {
        int[] grades = new int[6];

        // populate the array with scores
        for(int i = 0; i < grades.length; i++) {
            grades[i] = genGrade();
        }

        System.out.println(toString(grades));
        grades = curveScores(grades);
        System.out.println(toString(grades));
    }

    public static int genGrade() {
        // (int)(Math.random() * (max - min + 1) + min)
        return (int)(Math.random() * 46 + 55);
    }

    public static String toString(int[] arr) {
        String str = "[";

        // for(int value : arr) {
        //     str += value + ", ";
        // }

        for(int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1];

        return str + "]";
    }

    public static int[] curveScores(int[] arr) {
        // does not allow edits/updates to the arr
        // for(int score : arr) {
        //     if(score <= 95) {
        //         score += 5;
        //     }
        // }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= 95) {
                arr[i] += 5;
            }
        }
        return arr;
    }
}