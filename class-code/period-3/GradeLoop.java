public class GradeLoop {
    public static void main(String[] args) {
        int[] grades = new int[6];

        // populate with random grades from 55 - 100
        for(int i = 0; i < grades.length; i++) {
            grades[i] = genGrade();
        }

        System.out.println(toString(grades));
        grades = curveScores(grades, 5);
        System.out.println(toString(grades));
    }

    public static int genGrade() {
        return (int)(Math.random()*46+55);
    }

    public static String toString(int[] arr) {
        String str = "[";
        
        // issue adding extra comma at end
        // for(int value : arr) {
        //     str += value + ", ";
        // }

        for(int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1];

        return str + "]";
    }

    public static int[] curveScores(int[] arr, int amt) {
        // can't update arr using enhanced for loop
        // for(int grade : arr) {
        //     if(grade <= 95) {
        //         grade += amt;
        //     }
        // }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= 100 - amt) {
                arr[i] += amt;
            }
        }
        return arr;
    }
}