package ExerciceNote.Vehicules;

/**
 * Classe abstraite représentant un véhicule maritime.
 * Sert de base pour les véhicules marins.
 */
public abstract class Maritime extends Vehicule {
    /**
     * Construit un véhicule maritime avec les informations de base.
     *
     * @param marque la marque du véhicule
     * @param modele le modèle du véhicule
     * @param numImmat le numéro d'immatriculation
     */
    public Maritime(String marque, String modele, String numImmat) {
        super(marque, modele, numImmat);
    }
}