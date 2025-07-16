package java14;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Figure fig = FigureUtil.getRandomFigure();
            System.out.print("Figure #" + i + " : ");
            fig.affiche();
        }
    }
}