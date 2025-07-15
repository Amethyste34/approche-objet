package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        // Utilisation du constructeur nom/prénom uniquement
        Personne personne1 = new Personne("Durand", "Claire");

        // Création de l’adresse à ajouter ensuite
        AdressePostale adresse1 = new AdressePostale(10, "Rue du Soleil", 31000, "Toulouse");

        // Utilisation du setter pour modifier l'adresse
        personne1.setAdresse(adresse1);

        // Affichage du nom et prénom
        personne1.afficherNomPrenom();

        // Modification du nom et prénom
        personne1.setNom("Martin");
        personne1.setPrenom("Julie");

        // Nouvelle adresse
        AdressePostale nouvelleAdresse = new AdressePostale(20, "Avenue de la Liberté", 13000, "Marseille");
        personne1.setAdresse(nouvelleAdresse);

        // Affichage après modification
        personne1.afficherNomPrenom();

        // Test des getters
        System.out.println("Nom : " + personne1.getNom());
        System.out.println("Prénom : " + personne1.getPrenom());
        System.out.println("Ville : " + personne1.getAdresse().ville);
    }
}