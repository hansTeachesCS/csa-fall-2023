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

    // other methods
    public int[] getScores() {
        return scores;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double calculateAverage() {
        double sum = 0;
        for(int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public void addScore(int score) {
        // Create a new array of size n+1
        int n = scores.length;
        int[] newArray = new int[n+1];

        // Add the n elements of the original array in this array.
        for(int i = 0; i < n; i++) {
            newArray[i] = scores[i]; 
        }

        // Add the new element in the n+1 th position.
        newArray[n] = score;

        // store the new array to the instance variable.
        scores = newArray;
    }

    public String toString() {
        return name + "(" + osis + ") is a " + gradeLevel + "th grader.";
    }

    
}