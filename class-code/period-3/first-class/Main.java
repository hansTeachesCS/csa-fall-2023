import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hans", 12, new int[]{99, 75}, "123456789");
        System.out.println(s1);
        System.out.println(Arrays.toString(s1.getScores()));
        s1.addScore(95);
        System.out.println(Arrays.toString(s1.getScores()));

        // Student s2 = new Student("Frank");
        //System.out.println(s2);

        // TO DO: create more students!
    }
}