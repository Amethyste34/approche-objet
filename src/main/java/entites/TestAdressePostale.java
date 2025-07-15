package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 12;
        adresse1.libelleRue = "Rue des Lilas";
        adresse1.codePostal = 34000;
        adresse1.ville = "Montpellier";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 5;
        adresse2.libelleRue = "Avenue Jean Jaurès";
        adresse2.codePostal = 75000;
        adresse2.ville = "Paris";
    }
}