package ExerciceNote.Vehicules;

import ExerciceNote.Port;

/**
 * Représente un bateau motorisé pouvant être amarré dans un port.
 * Hérite de {@link Maritime} et implémente l'interface {@link AMoteur}.
 *
 * Un bateau possède un réservoir de carburant dont la taille peut être précisée au constructeur.
 */
public class Bateau extends Maritime implements AMoteur {
    /** Capacité du réservoir en litres */
    private int reservoir;

    /**
     * Construit un bateau avec une capacité de réservoir par défaut (200 litres).
     *
     * @param marque la marque du bateau
     * @param modele le modèle du bateau
     * @param numImmat le numéro d'immatriculation
     */
    public Bateau(String marque, String modele, String numImmat) {
        this(marque, modele, numImmat, 200);
    }

    /**
     * Construit un bateau avec une capacité de réservoir spécifiée.
     *
     * @param marque la marque du bateau
     * @param modele le modèle du bateau
     * @param numImmat le numéro d'immatriculation
     * @param reservoir la taille du réservoir en litres
     * @throws IllegalArgumentException si la taille du réservoir est inférieure ou égale à 0
     */
    public Bateau(String marque, String modele, String numImmat, int reservoir) {
        super(marque, modele, numImmat);
        if (reservoir <= 0) {
            throw new IllegalArgumentException("Taille du réservoir invalide pour le bateau");
        }
        this.reservoir = reservoir;
    }

    /**
     * Retourne la capacité du réservoir du bateau.
     *
     * @return capacité du réservoir en litres
     */
    @Override
    public int getReservoir() {
        return reservoir;
    }

    /**
     * Remplit le réservoir du bateau à partir du réservoir du port.
     *
     * @param port le port servant de source de carburant
     * @throws Exception si le port n'a pas suffisamment de carburant disponible
     */
    @Override
    public void remplirReservoir(Port port) throws Exception {
        port.obtenirCarburant(reservoir);
    }

    /**
     * Retourne une description textuelle du bateau, incluant son réservoir.
     *
     * @return description du bateau
     */
    @Override
    public String toString() {
        return "Bateau " + super.toString() + " [réservoir : " + reservoir + "L]";
    }
}