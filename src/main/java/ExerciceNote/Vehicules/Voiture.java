package ExerciceNote.Vehicules;

import ExerciceNote.Port;

/**
 * Classe représentant une voiture.
 * Hérite de Routier et implémente AMoteur.
 */
public class Voiture extends Routier implements AMoteur {
    /** Capacité du réservoir de carburant en litres pour la voiture. */
    private int reservoir;

    /**
     * Constructeur avec réservoir par défaut (50L).
     *
     * @param marque la marque du véhicule
     * @param modele le modèle du véhicule
     * @param numImmat le numéro d'immatriculation
     */
    public Voiture(String marque, String modele, String numImmat) {
        this(marque, modele, numImmat, 50);
    }

    /**
     * Constructeur avec réservoir personnalisé.
     *
     * @param marque la marque du véhicule
     * @param modele le modèle du véhicule
     * @param numImmat le numéro d'immatriculation
     * @param reservoir la taille du réservoir
     * @throws IllegalArgumentException si le réservoir est <= 0
     */
    public Voiture(String marque, String modele, String numImmat, int reservoir) {
        super(marque, modele, numImmat);
        if (reservoir <= 0) throw new IllegalArgumentException("Taille du réservoir invalide");
        this.reservoir = reservoir;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getReservoir() {
        return reservoir;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remplirReservoir(Port port) throws Exception {
        port.obtenirCarburant(reservoir);
    }

    /**
     * Retourne une représentation textuelle de la voiture.
     *
     * @return description complète de la voiture
     */
    @Override
    public String toString() {
        return "Voiture " + super.toString() + " [réservoir : " + reservoir + "L]";
    }
}