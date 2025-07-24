package openfoodfacts.services;

import openfoodfacts.entites.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockService {
    // Pour éviter les doublons en mémoire
    private Map<String, Categorie> categories = new HashMap<>();
    private Map<String, Marque> marques = new HashMap<>();
    private Map<String, Ingredient> ingredientsMap = new HashMap<>();
    private Map<String, Additif> additifsMap = new HashMap<>();
    private Map<String, Allergene> allergenesMap = new HashMap<>();

    public Stock chargerStock(String cheminFichier) {
        Stock stock = new Stock();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(cheminFichier);
        if (inputStream == null) {
            System.err.println("Fichier non trouvé : " + cheminFichier);
            return stock;
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String ligne = reader.readLine(); // skip entête

            while ((ligne = reader.readLine()) != null) {
                String[] tokens = ligne.split("\\|", -1); // -1 pour conserver les vides

                if (tokens.length < 30) continue; // données incomplètes

                // Champs de base
                String categorieNom = tokens[0];
                String marqueNom = tokens[1];
                String nomProduit = tokens[2];
                String grade = tokens[3];
                String listeIngredients = tokens[4];
                String listeAllergenes = tokens[28];
                String listeAdditifs = tokens[29];

                Categorie categorie = categories.computeIfAbsent(categorieNom, Categorie::new);
                Marque marque = marques.computeIfAbsent(marqueNom, Marque::new);

                List<Ingredient> ingredients = new ArrayList<>();
                for (String ing : listeIngredients.split(",")) {
                    String propre = ing.trim().toLowerCase();
                    if (!propre.isEmpty()) {
                        ingredients.add(ingredientsMap.computeIfAbsent(propre, Ingredient::new));
                    }
                }

                List<Allergene> allergenes = new ArrayList<>();
                for (String allergene : listeAllergenes.split(",")) {
                    String propre = allergene.trim().toLowerCase();
                    if (!propre.isEmpty()) {
                        allergenes.add(allergenesMap.computeIfAbsent(propre, Allergene::new));
                    }
                }

                List<Additif> additifs = new ArrayList<>();
                for (String additif : listeAdditifs.split(",")) {
                    String propre = additif.trim().toLowerCase();
                    if (!propre.isEmpty()) {
                        additifs.add(additifsMap.computeIfAbsent(propre, Additif::new));
                    }
                }

                Produit produit = new Produit(categorie, marque, nomProduit, grade, ingredients, additifs, allergenes);
                stock.ajouterProduit(produit);
            }

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

        return stock;
    }
}