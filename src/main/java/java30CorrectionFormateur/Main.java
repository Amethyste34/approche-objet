package java30CorrectionFormateur;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Figure 01 :" + FigureUtil.createRandomFigure("01"));
            System.out.println("Figure 02 :" + FigureUtil.createRandomFigure("02"));
            System.out.println("Figure 03 :" + FigureUtil.createRandomFigure("03"));
            System.out.println("Figure 04 :" + FigureUtil.createRandomFigure("04"));
            System.out.println("Figure 05 :" + FigureUtil.createRandomFigure("05"));
            System.out.println("Figure 06 :" + FigureUtil.createRandomFigure("06"));
            System.out.println("Figure 07 :" + FigureUtil.createRandomFigure("07"));
        } catch (DessinHorsLimiteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------------------------");

        System.out.println("Figure 03 :" + FigureUtil.get("03"));
        System.out.println("Figure 05 :" + FigureUtil.get("05"));
        System.out.println("Figure 01 :" + FigureUtil.get("01"));

        Point p = null;
        try {
            p = new Point(10, 10);
            Figure f = new Carre(p, 20, Couleur.Bleu);
            Figure f2 = new Carre(p, 20, Couleur.Bleu);
            Figure f3 = new Carre(p, 20, Couleur.Rouge);

            System.out.println("f :" + f);
            System.out.println("f2 :" + f2);
            System.out.println("f3 :" + f3);
            System.out.println("f.equals(f2) = " + f.equals(f2));
            System.out.println("f.equals(f3) = " + f.equals(f3));
            System.out.println("f2.equals(f3) = " + f2.equals(f3));
        } catch (DessinHorsLimiteException e) {
            System.out.println(e.getMessage());;
        }
    }
}
