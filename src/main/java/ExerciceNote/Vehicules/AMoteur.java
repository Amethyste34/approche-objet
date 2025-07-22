package ExerciceNote.Vehicules;

import ExerciceNote.Port;

/**
 * Interface pour les véhicules à moteur.
 * Fournit les méthodes liées à la gestion du réservoir.
 */
public interface AMoteur {
    /**
     * Remplit le réservoir du véhicule à partir du réservoir du port.
     *
     * @param port le port utilisé comme source de carburant
     * @throws Exception si le port n'a pas assez de carburant
     */
    void remplirReservoir(Port port) throws Exception;

    /**
     * Retourne la taille du réservoir du véhicule.
     *
     * @return capacité du réservoir en litres
     */
    int getReservoir();
}