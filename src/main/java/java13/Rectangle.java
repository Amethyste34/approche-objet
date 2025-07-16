package java13;

public class Rectangle {
    protected Point p1, p2, p3, p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
        this.p4 = new Point(p4);
    }

    public void affiche() {
        System.out.println(toString());
    }

    public String toString() {
        return "RECTANGLE " + p1 + p2 + p3 + p4;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return this.p1.equals(other.p1) &&
                this.p2.equals(other.p2) &&
                this.p3.equals(other.p3) &&
                this.p4.equals(other.p4);
    }
}