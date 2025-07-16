package java13;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST EQUALS POINT ===");
        Point a = new Point(10, 20);
        Point b = new Point(10, 20);
        Point c = new Point(15, 25);
        System.out.println("a.equals(b) = " + a.equals(b)); // true
        System.out.println("a.equals(c) = " + a.equals(c)); // false

        System.out.println("\n=== TEST EQUALS RECTANGLE ===");
        Rectangle r1 = new Rectangle(new Point(0, 0), new Point(4, 0), new Point(4, 3), new Point(0, 3));
        Rectangle r2 = new Rectangle(new Point(0, 0), new Point(4, 0), new Point(4, 3), new Point(0, 3));
        Rectangle r3 = new Rectangle(new Point(1, 1), new Point(5, 1), new Point(5, 4), new Point(1, 4));
        System.out.println("r1.equals(r2) = " + r1.equals(r2)); // true
        System.out.println("r1.equals(r3) = " + r1.equals(r3)); // false

        System.out.println("\n=== TEST EQUALS CARRE ===");
        Carre c1 = new Carre(new Point(5, 5), 4);
        Carre c2 = new Carre(new Point(5, 5), 4);
        Carre c3 = new Carre(new Point(0, 0), 4);
        System.out.println("c1.equals(c2) = " + c1.equals(c2)); // true
        System.out.println("c1.equals(c3) = " + c1.equals(c3)); // false

        System.out.println("\n=== TEST EQUALS CARREHERITE ===");
        CarreHerite ch1 = new CarreHerite(new Point(5, 5), 4);
        CarreHerite ch2 = new CarreHerite(new Point(5, 5), 4);
        CarreHerite ch3 = new CarreHerite(new Point(2, 2), 4);
        System.out.println("ch1.equals(ch2) = " + ch1.equals(ch2)); // true
        System.out.println("ch1.equals(ch3) = " + ch1.equals(ch3)); // false

        System.out.println("\n=== TEST CARRE VS RECTANGLE ===");
        System.out.println("c1.equals(r1) = " + c1.equals(r1)); // false
        Carre c4 = new Carre(new Point(0, 0), 3);
        Rectangle r4 = new Rectangle(new Point(0, 0), new Point(3, 0), new Point(3, 3), new Point(0, 3));
        System.out.println("c4.equals(r4) = " + c4.equals(r4)); // true
    }
}
