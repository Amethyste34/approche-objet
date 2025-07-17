package java20;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Figures quelconques ===");
        for (int i = 0; i < 5; i++) {
            Figure f = FigureUtil.getRandomFigure();
            System.out.println("Figure générée : " + f.getNom() + " → " + f);
        }

        System.out.println("\n=== Surfacable uniquement ===");
        for (int i = 0; i < 3; i++) {
            Surfacable s = FigureUtil.getRandomSurfacable();
            System.out.println("Surfacable : " + ((Figure) s).getNom() + " → surface = " + s.surface());
        }

        System.out.println("\n=== Points extraits de f1, f2, f3 ===");
        Figure f1 = new Rond(new Point(10, 10), 5);
        Figure f2 = new Carre(new Point(0, 0), 10);
        Figure f3 = new Segment(new Point(1, 1), 5, true);

        Point[] tousLesPoints = FigureUtil.getPoints(f1, f2, f3);
        for (Point p : tousLesPoints) {
            System.out.println("Point : " + p);
        }
    }
}