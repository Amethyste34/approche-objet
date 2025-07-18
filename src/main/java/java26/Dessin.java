package java26;

import java.util.ArrayList;
import java.util.Collection;

public class Dessin {
    private final Collection<Figure> figures;

    public Dessin() {
        this.figures = new ArrayList<>();
    }

    public boolean ajouter(Figure f) {
        return figures.add(f);
    }

    public Collection<Figure> getFigures() {
        return figures;
    }

    public void affiche() throws DessinHorsLimiteException {
        for (Figure f : figures) {
            for (Point p : f.getPoints()) {
                if (p.getX() < 0 || p.getX() > 99 || p.getY() < 0 || p.getY() > 99) {
                    throw new DessinHorsLimiteException(
                            "Point hors limite : " + p + " dans la figure " + f.getNom()
                    );
                }
            }
            System.out.println(f.getNom() + " : " + f);
        }
    }
}