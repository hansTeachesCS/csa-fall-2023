public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Joshua", 12, new int[]{65, 90, 100}, "123456789");
        System.out.println(s1);
        System.out.println(s1.calculateAverage());
        
        Student s2 = new Student("Franklin", 9, new int[]{90, 90, 91}, "234567890");
        System.out.println(s2);
        System.out.println(s2.calculateAverage());
    }
}
