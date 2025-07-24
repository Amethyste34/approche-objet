package openfoodfacts.entites;

public class Allergene {
    private String libelle;

    public Allergene(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    @Override
    public String toString() {
        return libelle;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Allergene)) return false;
        return libelle.equalsIgnoreCase(((Allergene) obj).libelle);
    }

    @Override
    public int hashCode() {
        return libelle.toLowerCase().hashCode();
    }
}
