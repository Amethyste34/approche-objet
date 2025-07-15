package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(10, "Rue du Soleil", 31000, "Toulouse");
        AdressePostale adresse2 = new AdressePostale(25, "Boulevard Haussmann", 75009, "Paris");

        // Utilisation du premier constructeur (nom + prénom)
        Personne personne1 = new Personne("Durand", "Claire");

        // Utilisation du second constructeur (nom + prénom + adresse)
        Personne personne2 = new Personne("Martin", "Julien", adresse2);
    }
}

// Conclusion
// Avant utilisation des constructeurs, il fallait plusieurs lignes pour l'instanciation puis l'affectation des champs
// Maintenant, avec les constructeurs, l'instanciation d'une personne se fait en une seule ligne claire et concise
// Le code est plus propre et plus lisible, il y a moins de répétitions, et il y a moins de risques d'oubli car on initialise tout en une seule fois