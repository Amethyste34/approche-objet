package java30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    public void affiche() {
        List<String> erreurs = new ArrayList<>();

        for (Figure f : figures) {
            boolean horsLimite = false;
            for (Point p : f.getPoints()) {
                if (p.getX() < 0 || p.getX() > 99 || p.getY() < 0 || p.getY() > 99) {
                    erreurs.add("Figure " + f.getNom() + " avec point hors limite : " + p);
                    horsLimite = true;
                    break; // On arrête dès qu’un point est invalide
                }
            }

            if (!horsLimite) {
                System.out.println(f.getNom() + " : " + f);
            }
        }

        if (!erreurs.isEmpty()) {
            System.out.println("\n--- Figures hors limites détectées ---");
            for (String msg : erreurs) {
                System.out.println(msg);
            }
        }
    }
}