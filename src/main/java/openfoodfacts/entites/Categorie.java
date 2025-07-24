package openfoodfacts.entites;

public class Categorie {
    private String libelle;

    public Categorie(String libelle) {
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
        if (!(obj instanceof Categorie)) return false;
        return libelle.equalsIgnoreCase(((Categorie) obj).libelle);
    }

    @Override
    public int hashCode() {
        return libelle.toLowerCase().hashCode();
    }
}