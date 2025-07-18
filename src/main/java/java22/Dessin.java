package java22;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Dessin {

    // Choix : LinkedHashSet pour garder l'ordre d'insertion ET éviter doublons
    private Collection<Figure> figures;

    public Dessin() {
        this.figures = new LinkedHashSet<>();
    }

    public Dessin(Collection<Figure> figures) {
        this.figures = new LinkedHashSet<>(figures);
    }

    public boolean add(Figure figure) {
        return figures.add(figure);
    }

    public Collection<Figure> getFigures() {
        return java.util.Collections.unmodifiableCollection(figures);
    }

    public void ajouter(Figure f) {
        figures.add(f);
    }
}