package ExerciceNote.Vehicules;

/**
 * Classe représentant un voilier.
 * Hérite de Maritime, sans moteur.
 */
public class Voilier extends Maritime {
    /**
     * Construit un voilier avec les informations données.
     *
     * @param marque la marque du voilier
     * @param modele le modèle du voilier
     * @param numImmat le numéro d'immatriculation
     */
    public Voilier(String marque, String modele, String numImmat) {
        super(marque, modele, numImmat);
    }

    /**
     * Retourne une représentation textuelle du voilier.
     *
     * @return une description du voilier sous la forme "Voilier {marque} {modele} [{numImmat}]"
     */
    @Override
    public String toString() {
        return "Voilier " + super.toString();
    }
}