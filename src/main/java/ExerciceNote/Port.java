package ExerciceNote;

import ExerciceNote.Vehicules.*;

import java.util.ArrayList;

/**
 * Classe représentant un port pouvant accueillir des véhicules.
 * Gère les parkings pour voitures et motos, ainsi que le bassin pour les bateaux.
 * Gère également un réservoir de carburant.
 */
public class Port {
    /** Liste des voitures garées dans le port. */
    private ArrayList<Voiture> voitures = new ArrayList<>();
    /** Liste des motos garées dans le port. */
    private ArrayList<Moto> motos = new ArrayList<>();
    /** Liste des véhicules maritimes amarrés dans le port (bateaux et voiliers). */
    private ArrayList<Maritime> maritimes = new ArrayList<>();

    /** Nombre maximum de places disponibles pour les voitures. */
    private int maxVoitures;
    /** Nombre maximum de places disponibles pour les motos. */
    private int maxMotos;
    /** Nombre maximum de places disponibles pour les véhicules maritimes. */
    private int maxMaritimes;

    /** Quantité actuelle de carburant disponible dans le réservoir du port (en litres). */
    private int reservoir;
    /** Capacité maximale du réservoir de carburant du port (en litres). */
    private int reservoirMax;

    /**
     * Construit un port avec les capacités par défaut :
     * 10 voitures, 5 motos, 20 maritimes et 500 litres de carburant.
     */
    public Port() {
        this(10, 5, 20, 500);
    }

    /**
     * Construit un port avec des capacités personnalisées.
     *
     * @param maxVoitures nombre de places pour les voitures (>= 0)
     * @param maxMotos nombre de places pour les motos (>= 0)
     * @param maxMaritimes nombre de places pour bateaux/voiliers (>= 0)
     * @param reservoirMax capacité max du réservoir (doit être > 0)
     * @throws IllegalArgumentException si une valeur est invalide
     */
    public Port(int maxVoitures, int maxMotos, int maxMaritimes, int reservoirMax) {
        if (maxVoitures < 0 || maxMotos < 0 || maxMaritimes < 0) {
            throw new IllegalArgumentException("Le nombre de places doit être >= 0");
        }
        if (reservoirMax <= 0) {
            throw new IllegalArgumentException("La capacité du réservoir doit être > 0");
        }
        this.maxVoitures = maxVoitures;
        this.maxMotos = maxMotos;
        this.maxMaritimes = maxMaritimes;
        this.reservoirMax = reservoirMax;
        this.reservoir = reservoirMax;
    }

    /**
     * Gare un véhicule routier dans le port.
     *
     * @param vehicule véhicule à garer
     * @throws Exception si la place est indisponible ou le type non reconnu
     */
    public void garer(Routier vehicule) throws Exception {
        if (vehicule instanceof Voiture) {
            if (voitures.size() >= maxVoitures) {
                throw new Exception("Parking voitures complet");
            }
            voitures.add((Voiture) vehicule);
        } else if (vehicule instanceof Moto) {
            if (motos.size() >= maxMotos) {
                throw new Exception("Parking motos complet");
            }
            motos.add((Moto) vehicule);
        } else {
            throw new Exception("Type de véhicule routier non pris en charge");
        }
    }

    /**
     * Amarre un véhicule maritime dans le bassin.
     *
     * @param vehicule véhicule à amarer
     * @throws Exception si le bassin est plein
     */
    public void amarer(Maritime vehicule) throws Exception {
        if (maritimes.size() >= maxMaritimes) {
            throw new Exception("Bassin complet");
        }
        maritimes.add(vehicule);
    }

    /**
     * Retire un véhicule du port.
     *
     * @param vehicule véhicule à retirer
     */
    public void sortir(Vehicule vehicule) {
        if (vehicule instanceof Voiture) {
            voitures.remove(vehicule);
        } else if (vehicule instanceof  Moto) {
            motos.remove(vehicule);
        } else if (vehicule instanceof  Maritime) {
            maritimes.remove(vehicule);
        }
    }

    /**
     * Remplit à nouveau le réservoir du port à sa capacité maximale.
     */
    public void remplirReservoir() {
        this.reservoir = this.reservoirMax;
    }

    /**
     * @return la capacité maximale du réservoir
     */
    public int getReservoirMax() {
        return reservoirMax;
    }

    /**
     * @return le carburant restant dans le réservoir
     */
    public int getReservoir() {
        return reservoir;
    }

    /**
     * Tente de retirer du carburant du réservoir du port.
     *
     * @param quantite litres demandés
     * @throws Exception si le réservoir ne contient pas assez de carburant
     */
    public void obtenirCarburant(int quantite) throws Exception {
        if (quantite > reservoir) {
            throw new Exception("Pas assez de carburant dans le port");
        }
        this.reservoir -= quantite;
    }

    /**
     * Affiche un résumé de l’état du port.
     *
     * @return texte décrivant les véhicules et le réservoir
     */
    @Override
    public  String toString() {
        int nbBateau = 0, nbVoilier = 0;
        for (Maritime m : maritimes) {
            if (m instanceof  Bateau) nbBateau++;
            else if (m instanceof Voilier) nbVoilier++;
        }
        return String.format("Le port contient :\n- %d voitures\n- %d motos\n- %d bateaux\n- %d voiliers\nRéservoir du port : %d/%d litres",
                voitures.size(), motos.size(), nbBateau, nbVoilier, reservoir, reservoirMax);
    }
}