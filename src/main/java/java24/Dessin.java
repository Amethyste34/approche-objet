package java24;

import java.util.ArrayList;
import java.util.Collection;

public class Dessin {
    private final Collection<Figure> figures;

    public Dessin() {
        // Choix: ArrayList pour garder l'ordre d'ajout et accès rapide
        this.figures = new ArrayList<>();
    }

    public boolean ajouter(Figure f) {
        return figures.add(f);
    }

    public Collection<Figure> getFigures() {
        return figures;
    }
}