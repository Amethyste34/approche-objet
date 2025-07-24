package openfoodfacts.entites;

public class Additif {
    private String libelle;

    public Additif(String libelle) {
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
        if (!(obj instanceof Additif)) return false;
        return libelle.equalsIgnoreCase(((Additif) obj).libelle);
    }

    @Override
    public int hashCode() {
        return libelle.toLowerCase().hashCode();
    }
}