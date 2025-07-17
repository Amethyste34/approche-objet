package java21;

import java.util.Collection;

public abstract class Figure {
    public abstract void affiche();
    public abstract String toString();
    public abstract boolean equals(Object obj);
    public abstract String getNom();
    public abstract Collection<Point> getPoints();
}