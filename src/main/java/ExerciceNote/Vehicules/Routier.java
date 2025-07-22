package ExerciceNote.Vehicules;

/**
 * Classe abstraite représentant un véhicule routier.
 * Sert de base pour les véhicules terrestres.
 */
public abstract class Routier extends Vehicule {
    /**
     * Construit un véhicule routier avec les informations de base.
     *
     * @param marque la marque du véhicule
     * @param modele le modèle du véhicule
     * @param numImmat le numéro d'immatriculation
     */
    public Routier(String marque, String modele, String numImmat) {
        super(marque, modele, numImmat);
    }
}