package java22;

public class Main {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();

        // Ajout d’un rond de centre (10, 10) et rayon 5
        Rond rond = new Rond(new Point(10, 10), 5);
        dessin.ajouter(rond);

        // Ajout d’un rectangle de coin supérieur gauche (20, 20) et largeur 10, hauteur 5
        Rectangle rect = new Rectangle(new Point(20, 20), 10, 5);
        dessin.ajouter(rect);

        // Point dans le rond
        Point p1 = new Point(12, 10);
        Figure f1 = FigureUtil.getFigureEn(p1, dessin);
        System.out.println("Point " + p1 + " est dans : " + (f1 != null ? f1 : "aucune figure"));

        // Point dans le rectangle
        Point p2 = new Point(25, 22);
        Figure f2 = FigureUtil.getFigureEn(p2, dessin);
        System.out.println("Point " + p2 + " est dans : " + (f2 != null ? f2 : "aucune figure"));

        // Point à l’extérieur des deux
        Point p3 = new Point(0, 0);
        Figure f3 = FigureUtil.getFigureEn(p3, dessin);
        System.out.println("Point " + p3 + " est dans : " + (f3 != null ? f3 : "aucune figure"));

        // Point au bord du rond
        Point p4 = new Point(15, 10); // distance exacte = rayon
        Figure f4 = FigureUtil.getFigureEn(p4, dessin);
        System.out.println("Point " + p4 + " est dans : " + (f4 != null ? f4 : "aucune figure"));

        // Point au bord du rectangle
        Point p5 = new Point(20, 25); // bord inférieur
        Figure f5 = FigureUtil.getFigureEn(p5, dessin);
        System.out.println("Point " + p5 + " est dans : " + (f5 != null ? f5 : "aucune figure"));
    }
}