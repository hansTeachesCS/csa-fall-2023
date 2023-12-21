public class GradeLoop {
    public static void main(String[] args) {
        int[] grades = new int[6];

        // populate the array with scores
        for(int i = 0; i < grades.length; i++) {
            grades[i] = genGrade();
        }

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


}