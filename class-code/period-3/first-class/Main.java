import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hans", 12, new int[]{99, 75}, "123456789");
        System.out.println(s1);
        System.out.println(Arrays.toString(s1.getScores()));
        System.out.println(s1.calculateAverage());

        s1.addScore(95);
        System.out.println(s1.calculateAverage());
        System.out.println(Arrays.toString(s1.getScores()));
        
        s1.setName("Joshua");
        System.out.println(s1);

        // Student s2 = new Student("Frank Ocean", 9, new int[]{55}, "198919891");
        // System.out.println();
        // System.out.println(Arrays.toString(s2.getScores()));
        // System.out.println(s2.calculateAverage());

        // TO DO: create more students!
    }
}
