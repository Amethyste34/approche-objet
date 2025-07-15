package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 10;
        adresse1.libelleRue = "Rue du Soleil";
        adresse1.codePostal = 31000;
        adresse1.ville = "Toulouse";

        Personne personne1 = new Personne();
        personne1.nom = "Durand";
        personne1.prenom = "Claire";
        personne1.adresse = adresse1;

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 25;
        adresse2.libelleRue = "Boulevard Haussmann";
        adresse2.codePostal = 75009;
        adresse2.ville = "Paris";

        Personne personne2 = new Personne();
        personne2.nom = "Martin";
        personne2.prenom = "Julien";
        personne2.adresse = adresse2;
    }
}

// QUESTION 7 : Prise de recul
// Avantage : Chaque classe est bien séparée, ce qui respecte les principes de la POO
// Inconvénient : Il y a beaucoup de lignes répétitives
// Solution :
// Utilisation de constructeurs pour raccourcir l'instanciation.
// Il faut encapsuler les données en rendant les attributs privés (private) et en utilisant les accesseurs getters et setters