package java21;

import java.util.Collection;

public abstract class Figure {
    // Retourne la collection des points de la figure
    // Choix collection ordonnée, facile à manipuler et à parcourir
    public abstract Collection<Point> getPoints();

    public abstract String getNom();

    public abstract void affiche();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();
}