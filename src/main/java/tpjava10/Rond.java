package tpjava10;

public class Rond {
    private Point centre;
    private int rayon;

    public Rond(Point centre, int rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "ROND " + centre.toString() + " , " + rayon;
    }

    public void affiche() {
        System.out.println(this.toString());
    }
}