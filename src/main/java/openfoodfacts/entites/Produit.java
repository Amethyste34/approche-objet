package openfoodfacts.entites;

import java.util.List;

public class Produit {
    private Categorie categorie;
    private Marque marque;
    private String nom;
    private String nutritionGradeFr;

    private List<Ingredient> ingredients;
    private List<Additif> additifs;
    private List<Allergene> allergenes;

    public Produit(Categorie categorie, Marque marque, String nom, String nutritionGradeFr,
                   List<Ingredient> ingredients, List<Additif> additifs, List<Allergene> allergenes) {
        this.categorie = categorie;
        this.marque = marque;
        this.nom = nom;
        this.nutritionGradeFr = nutritionGradeFr;
        this.ingredients = ingredients;
        this.additifs = additifs;
        this.allergenes = allergenes;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNutritionGradeFr() {
        return nutritionGradeFr;
    }

    public void setNutritionGradeFr(String nutritionGradeFr) {
        this.nutritionGradeFr = nutritionGradeFr;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(List<Additif> additifs) {
        this.additifs = additifs;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", catégorie='" + (categorie != null ? categorie.getLibelle() : "N/A") + '\'' +
                ", marque='" + (marque != null ? marque.getNom() : "N/A") + '\'' +
                ", score nutritionnel='" + nutritionGradeFr + '\'' +
                '}';
    }
}