package tpjava10;

public class TestFigureUtil {
    public static void main(String[] args) {
        Rond r1 = FigureUtil.getRandomRond();
        Rectangle rect1 = FigureUtil.getRandomRectangle();

        r1.affiche();
        rect1.affiche();

        // Test du constructeur par défaut de Point
        Point pDefaut = new Point();
        System.out.println("Point par défaut : " + pDefaut); // [25;25]
    }
}