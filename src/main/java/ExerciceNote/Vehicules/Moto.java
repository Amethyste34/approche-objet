package ExerciceNote.Vehicules;

import ExerciceNote.Port;

/**
 * Représente une moto, véhicule routier à moteur pouvant être garé dans un port.
 * Hérite de {@link Routier} et implémente l'interface {@link AMoteur}.
 *
 * Une moto possède un réservoir de carburant dont la taille peut être précisée au constructeur.
 */
public class Moto extends  Routier implements AMoteur {
    /** Capacité du réservoir en litres */
    private int reservoir;

    /**
     * Construit une moto avec une capacité de réservoir par défaut (20 litres).
     *
     * @param marque la marque de la moto
     * @param modele le modèle de la moto
     * @param numImmat le numéro d'immatriculation
     */
    public Moto(String marque, String modele, String numImmat) {
        this(marque, modele, numImmat, 20);
    }

    /**
     * Construit une moto avec une capacité de réservoir spécifiée.
     *
     * @param marque la marque de la moto
     * @param modele le modèle de la moto
     * @param numImmat le numéro d'immatriculation
     * @param reservoir la taille du réservoir en litres
     * @throws IllegalArgumentException si la taille du réservoir est inférieure ou égale à 0
     */
    public Moto(String marque, String modele, String numImmat, int reservoir) {
        super(marque, modele, numImmat);
        if (reservoir <= 0) {
            throw new IllegalArgumentException("Taille du réservoir invalide pour la moto");
        }
        this.reservoir = reservoir;
    }

    /**
     * Retourne la capacité du réservoir de la moto.
     *
     * @return capacité du réservoir en litres
     */
    @Override
    public int getReservoir() {
        return reservoir;
    }

    /**
     * Remplit le réservoir de la moto à partir du réservoir du port.
     *
     * @param port le port servant de source de carburant
     * @throws Exception si le port n'a pas suffisamment de carburant disponible
     */
    @Override
    public void  remplirReservoir(Port port) throws Exception {
        port.obtenirCarburant(reservoir);
    }

    /**
     * Retourne une description textuelle de la moto, incluant son réservoir.
     *
     * @return description de la moto
     */
    @Override
    public String toString() {
        return "Moto " + super.toString() + " [réservoir : " + reservoir + "L]";
    }
}