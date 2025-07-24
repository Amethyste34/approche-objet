package openfoodfacts.entites;

public class Ingredient {
    private String libelle;

    public Ingredient(String libelle) {
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
        if (!(obj instanceof Ingredient)) return false;
        return libelle.equalsIgnoreCase(((Ingredient) obj).libelle);
    }

    @Override
    public int hashCode() {
        return libelle.toLowerCase().hashCode();
    }
}