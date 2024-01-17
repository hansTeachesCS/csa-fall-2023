public class Student {
    // fields, instance variables
    private String name;
    private int gradeLevel;
    private int[] scores;
    private String osis;

    // constructor method
    public Student(String n, int g, int[] s, String o) {
        name = n;
        gradeLevel = g;
        scores = s;
        osis = o;
    }

    // other methods
    public String toString() {
        return name + " " + osis;
    }

    // TO DO: add more behaviors, like calculating average 
}