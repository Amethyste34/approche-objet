package fichier;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe qui permet de lire un fichier CSV et d'en afficher le contenu.
 *  * Utilisée dans le premier exercice pour découvrir la lecture de fichiers
 */
public class LectureFichier {
    /**
     * Méthode principale qui lit et affiche le contenu du fichier recensement.csv
     *
     * @param args non utilisé
     */
    public static void main(String[] args) {
        try {
            InputStream is = LectureFichier.class.getClassLoader().getResourceAsStream("recensement.csv");
            if (is == null) {
                throw new RuntimeException("Fichier recensement.csv introuvable dans les ressources.");
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
                String ligne;
                while ((ligne = reader.readLine()) != null) {
                    System.out.println(ligne);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}