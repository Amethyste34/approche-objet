package recensement;

import java.util.List;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe qui contient la liste de toutes les villes chargées depuis le fichier.
 * Sert de base de données en mémoire pour toutes les recherches.
 */
public class Recensement {
    private List<Ville> villes;

    /**
     * Constructeur du recensement.
     * @param villes liste des villes
     */
    public Recensement(List<Ville> villes) {
        this.villes = villes;
    }

    /** @return liste des villes */
    public List<Ville> getVilles() {
        return villes;
    }

    /** @param villes la liste des villes à définir */
    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }
}