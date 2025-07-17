package java21;

import java.util.Collection;

public class Carre extends Rectangle {

    public Carre(Point p, int cote) {
        super(
                p,
                new Point(p.getX() + cote, p.getY()),
                new Point(p.getX() + cote, p.getY() + cote),
                new Point(p.getX(), p.getY() + cote)
        );
    }

    @Override
    public String getNom() {
        return "Carre";
    }

    // Pas besoin de redéfinir getPoints(), hérite de Rectangle

    @Override
    public String toString() {
        return "CARRE " + p1 + p2 + p3 + p4;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        // Un carré peut être égal à un rectangle
        if (obj instanceof Rectangle other) {
            return super.equals(other);
        }

        return false;
    }
}