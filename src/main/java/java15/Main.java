package java15;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Figures quelconques ===");
        for (int i = 0; i < 5; i++) {
            Figure f = FigureUtil.getRandomFigure();
            System.out.println(f.getNom() + " → " + f);
        }

        System.out.println("\n=== Surfacable uniquement ===");
        for (int i = 0; i < 3; i++) {
            Surfacable s = FigureUtil.getRandomSurfacable();
            System.out.println(((Figure) s).getNom() + " : surface = " + s.surface());
        }
    }
}