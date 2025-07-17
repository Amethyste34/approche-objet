package java21;

import java.util.ArrayList;
import java.util.Collection;

public class Dessin {
    private Collection<Figure> figures;

    public  Dessin() {
        // Je choisis ArrayList qui permet d'ajouter rapidement en fin de liste et de conserver l'ordre d'ajout
        this.figures = new ArrayList<>();
    }

    public boolean add(Figure f) {
        return figures.add(f);
    }

    public Collection<Figure> getFigures() {
        return figures;
    }
}