package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
            List<String> lignes = Files.readAllLines(Paths.get("recensement.csv"));
            for (String ligne : lignes) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}