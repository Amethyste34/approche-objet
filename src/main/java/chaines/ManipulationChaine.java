package chaines;

import entites.Salarie;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe qui sert à manipuler des chaînes de caractères
 */
public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        // 1) Premier caractère
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        // 2) Longueur
        int longueur = chaine.length();
        System.out.println("Longueur de la chaîne : " + longueur);

        // 3) Index du premier ;
        int indexPointVirgule = chaine.indexOf(';');
        System.out.println("Index du premier ';' : " + indexPointVirgule);

        // 4) Extraire le nom de famille
        String nom = chaine.substring(0, indexPointVirgule);
        System.out.println("Nom de famille : " + nom);

        // 5) Nom en majuscules
        System.out.println("Nom en majuscules : " + nom.toUpperCase());

        // 6) Nom en minuscules
        System.out.println("Nom en minuscules : " + nom.toLowerCase());

        // 7) Découpage avec split
        String[] morceaux = chaine.split(";");
        System.out.println(java.util.Arrays.toString(morceaux));
        System.out.println("Découpage de la chaine :");
        for (String morceau : morceaux) {
            System.out.println(" > " + morceau);
        }

        // 8 et 9) Création d’un Salarie
        String nomSalarie = morceaux[0];
        String prenomSalarie = morceaux[1];
        String salaireTexte = morceaux[2].replace(" ", "");
        double salaire = Double.parseDouble(salaireTexte);

        Salarie s = new Salarie(nomSalarie, prenomSalarie, salaire);
        System.out.println("Salarie créé : " + s);
    }
}