package openfoodfacts.entites;

public class Marque {
    private String nom;

    public Marque(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Marque)) return false;
        return nom.equalsIgnoreCase(((Marque) obj).nom);
    }

    @Override
    public int hashCode() {
        return nom.toLowerCase().hashCode();
    }
}