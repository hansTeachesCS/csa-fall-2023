public class Equation {
    public static void main(String[] args) {
        int search = 0;
        for(int x = 1; x <= 42; x++) {
            for(int y = 1; y <= 42; y++) {
                search++;
                if (Math.pow(y,3) == Math.pow(x,2)) {
                    if(Math.pow(y-x,2) == 4*y*y) {
                        System.out.println(x + y);
                        System.out.print("on the " + search + "th search, ");
                        System.out.println("x = " + x + " and y = " + y);
                    }
                }
            }
        }
    }
}