public class Student {
    // fields, instance variables
    private String name;
    private int gradeLevel;
    private int[] scores;
    private String osis;
    
    // constructor method 
    public Student(String n, int grade, int[] s, String o) {
        name = n;
        gradeLevel = grade;
        scores = s;
        osis = o;
    }

    public double calculateAverage() {
        double sum = 0;
        for(int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    // other methods
    public String toString() {
        return name + "(" + osis + ") is a " + gradeLevel + "th grader.";
    }

    
}