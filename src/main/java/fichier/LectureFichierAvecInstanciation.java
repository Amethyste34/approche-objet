package fichier;

import recensement.Recensement;
import recensement.Ville;

import java.io.*;
import java.nio.charset.StandardCharsets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe qui lit le fichier recensement.csv et instancie des objets Ville.
 *  * Stocke les villes dans une liste pour traitement ultérieur.
 */
public class LectureFichierAvecInstanciation {
    /**
     * Lit un fichier CSV depuis le classpath et retourne un objet Recensement contenant toutes les villes.
     * @param nomFichier Nom du fichier CSV dans le dossier resources
     * @return Recensement contenant la liste des villes du fichier
     * @throws IOException si le fichier est introuvable ou illisible
     */
    public static Recensement lire(String nomFichier) throws IOException {
        InputStream input = LectureFichierAvecInstanciation.class.getClassLoader().getResourceAsStream(nomFichier);
        if (input == null) {
            throw new FileNotFoundException("Fichier " + nomFichier + " non trouvé !");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        List<Ville> villes = new ArrayList<>();

        String ligne = reader.readLine(); // ignorer l'en-tête
        while ((ligne = reader.readLine()) != null) {
            String[] tokens = ligne.split(";");
            if (tokens.length < 10) continue;

            String codeRegion = tokens[0];
            String nomRegion = tokens[1];
            String codeDepartement = tokens[2];
            String codeCommune = tokens[5];
            String nomCommune = tokens[6];
            int population = Integer.parseInt(tokens[9].replaceAll(" ", ""));

            villes.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population));
        }

        return new Recensement(villes);
    }
}