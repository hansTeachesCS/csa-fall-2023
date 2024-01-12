public class Student {
    // fields, instance variables
    private String name;
    private int gradeLevel;
    // TO DO: add the rest of the fields you want

    
    // constructor method 
    public Student(String n, int grade) {
        name = n;
        gradeLevel = grade;
    }


    // other methods
    public String toString() {
        return name + " is a " + gradeLevel + "th grader.";
    }

    
}