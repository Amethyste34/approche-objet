package openfoodfacts.app;

import openfoodfacts.entites.Produit;
import openfoodfacts.entites.Stock;
import openfoodfacts.services.StockService;

import java.util.*;
import java.util.stream.Collectors;

public class ApplicationOpenFoodFacts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StockService service = new StockService();

        String chemin = "open-food-facts.csv";

        Stock stock = service.chargerStock(chemin);
        System.out.println("Chargement terminé. " + stock.getProduits().size() + " produits chargés.");

        int choix;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Meilleurs produits pour une marque");
            System.out.println("2. Meilleurs produits pour une catégorie");
            System.out.println("3. Meilleurs produits par marque et catégorie");
            System.out.println("4. Additifs les plus courants");
            System.out.println("5. Allergènes les plus courants");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = Integer.parseInt(scanner.nextLine());

            switch (choix) {
                case 1 -> meilleursProduitsParMarque(stock, scanner);
                case 2 -> meilleursProduitsParCategorie(stock, scanner);
                case 3 -> meilleursProduitsParMarqueEtCategorie(stock, scanner);
                case 4 -> additifsLesPlusCourants(stock);
                case 5 -> allergenesLesPlusCourants(stock);
            }

        } while (choix != 0);

        System.out.println("À bientôt !");
    }

    private static void meilleursProduitsParMarque(Stock stock, Scanner scanner) {
        System.out.print("Nom de la marque : ");
        String marque = scanner.nextLine().toLowerCase();
        stock.getProduits().stream()
                .filter(p -> p.getMarque().getNom().toLowerCase().contains(marque))
                .filter(p -> p.getNutritionGradeFr() != null && !p.getNutritionGradeFr().isEmpty())
                .sorted(Comparator.comparing(Produit::getNutritionGradeFr)) // A < B < C...
                .limit(10)
                .forEach(System.out::println);
    }

    private static void meilleursProduitsParCategorie(Stock stock, Scanner scanner) {
        System.out.print("Nom de la catégorie : ");
        String categorie = scanner.nextLine().toLowerCase();
        stock.getProduits().stream()
                .filter(p -> p.getCategorie().getLibelle().toLowerCase().contains(categorie))
                .filter(p -> p.getNutritionGradeFr() != null && !p.getNutritionGradeFr().isEmpty())
                .sorted(Comparator.comparing(Produit::getNutritionGradeFr))
                .limit(10)
                .forEach(System.out::println);
    }

    private static void meilleursProduitsParMarqueEtCategorie(Stock stock, Scanner scanner) {
        System.out.print("Nom de la marque : ");
        String marque = scanner.nextLine().toLowerCase();
        System.out.print("Nom de la catégorie : ");
        String categorie = scanner.nextLine().toLowerCase();

        stock.getProduits().stream()
                .filter(p -> p.getMarque().getNom().toLowerCase().contains(marque))
                .filter(p -> p.getCategorie().getLibelle().toLowerCase().contains(categorie))
                .filter(p -> p.getNutritionGradeFr() != null && !p.getNutritionGradeFr().isEmpty())
                .sorted(Comparator.comparing(Produit::getNutritionGradeFr))
                .limit(10)
                .forEach(System.out::println);
    }

    private static void additifsLesPlusCourants(Stock stock) {
        System.out.println("\nTop 10 des additifs les plus courants :");

        Map<String, Long> frequence = stock.getProduits().stream()
                .flatMap(p -> p.getAdditifs().stream())
                .collect(Collectors.groupingBy(a -> a.getLibelle(), Collectors.counting()));

        frequence.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(10)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue() + " produits"));
    }

    private static void allergenesLesPlusCourants(Stock stock) {
        System.out.println("\nTop 10 des allergènes les plus courants :");

        Map<String, Long> frequence = stock.getProduits().stream()
                .flatMap(p -> p.getAllergenes().stream())
                .collect(Collectors.groupingBy(a -> a.getLibelle(), Collectors.counting()));

        frequence.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(10)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue() + " produits"));
    }
}