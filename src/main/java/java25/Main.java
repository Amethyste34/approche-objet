package java25;


public class Main {
    public static void main(String[] args) {
        FigureUtil.getRandomCarre("c1");
        FigureUtil.getRandomRectangle("r1");
        FigureUtil.getRandomRond("o1");

        Figure f = FigureUtil.get("r1");
        System.out.println("Figure r1 : " + f.getNom() + " -> " + f);
    }
}