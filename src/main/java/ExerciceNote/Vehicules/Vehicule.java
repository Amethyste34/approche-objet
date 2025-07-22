package ExerciceNote.Vehicules;

/**
 * Classe de base représentant un véhicule, qu'il soit routier ou maritime.
 * Un véhicule est défini par une marque, un modèle et un numéro d'immatriculation.
 * Cette classe est destinée à être héritée.
 */
public abstract class Vehicule {
    /** Marque du véhicule */
    private String marque;

    /** Modèle du véhicule */
    private String modele;

    /** Numéro d'immatriculation du véhicule */
    private String numImmat;

    /**
     * Construit un véhicule avec les informations fournies.
     *
     * @param marque la marque du véhicule
     * @param modele le modèle du véhicule
     * @param numImmat le numéro d'immatriculation
     */
    public Vehicule(String marque, String modele, String numImmat) {
        this.marque = marque;
        this.modele = modele;
        this.numImmat = numImmat;
    }

    /**
     * Retourne la marque du véhicule.
     *
     * @return la marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Retourne le modèle du véhicule.
     *
     * @return le modèle
     */
    public String getModele() {
        return modele;
    }

    /**
     * Retourne le numéro d'immatriculation du véhicule.
     *
     * @return le numéro d'immatriculation
     */
    public String getNumImmat() {
        return numImmat;
    }

    /**
     * Retourne une représentation textuelle du véhicule.
     * Forme : "marque modèle [immat]"
     *
     * @return une description du véhicule
     */
    @Override
    public String toString() {
        return "N° : " + numImmat + ", Modèle : " + marque + " " + modele;
    }
}