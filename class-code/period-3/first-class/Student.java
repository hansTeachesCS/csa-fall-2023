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
    public int[] getScores() {
        return scores;
    }

    public void setName(String newName) {
        name = newName;
    } 

    public void addScore(int score) {
        // Create a new array of size n+1.
        int n = scores.length;
        int[] newScores = new int[n + 1];
        
        // Add the n elements of the original array in this array.
        for(int i = 0; i < n; i++) {
            newScores[i] = scores[i];
        }

        // Add the new element in the n+1 th position.
        newScores[n] = score;

        // Keep newScores in memory.
        scores = newScores;
    }

    public double calculateAverage() {
        double sum = 0;
        for(int score : scores) {
            sum += score;
        }
        return sum/scores.length;
    }

    public String toString() {
        return name + " " + osis;
    }

    // TO DO: add more behaviors, like calculating average 
}