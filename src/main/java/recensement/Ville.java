package recensement;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe représentant une ville avec les données du fichier recensement.csv.
 *  * Elle contient le nom de la commune, son code, son département, sa région, et sa population.
 */
public class Ville {
    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nomCommune;
    private int populationTotale;

    /**
     * Constructeur de la ville.
     *
     * @param codeRegion Code de la région
     * @param nomRegion Nom de la région
     * @param codeDepartement Code du département
     * @param codeCommune Code de la commune
     * @param nomCommune Nom de la commune
     * @param populationTotale Population totale
     */
    public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune,
                 String nomCommune, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationTotale = populationTotale;
    }

    // Getters et Setters
    /** @return le code de la région */
    public String getCodeRegion() { return codeRegion; }

    /** @param codeRegion le code de la région à définir */
    public void setCodeRegion(String codeRegion) { this.codeRegion = codeRegion; }

    /** @return le nom de la région */
    public String getNomRegion() { return nomRegion; }

    /** @param nomRegion le nom de la région à définir */
    public void setNomRegion(String nomRegion) { this.nomRegion = nomRegion; }

    /** @return le code du département */
    public String getCodeDepartement() { return codeDepartement; }

    /** @param codeDepartement le code du département à définir */
    public void setCodeDepartement(String codeDepartement) { this.codeDepartement = codeDepartement; }

    /** @return le code de la commune */
    public String getCodeCommune() { return codeCommune; }

    /** @param codeCommune le code de la commune à définir */
    public void setCodeCommune(String codeCommune) { this.codeCommune = codeCommune; }

    /** @return le nom de la commune */
    public String getNomCommune() { return nomCommune; }

    /** @param nomCommune le nom de la commune à définir */
    public void setNomCommune(String nomCommune) { this.nomCommune = nomCommune; }

    /** @return la population totale */
    public int getPopulationTotale() { return populationTotale; }

    /** @param populationTotale la population totale à définir */
    public void setPopulationTotale(int populationTotale) { this.populationTotale = populationTotale; }

    /**
     * Retourne une représentation textuelle de la ville, incluant le nom, le code département,
     * la région et la population totale.
     * @return une chaîne de caractères représentant la ville sous forme lisible.
     */
    @Override
    public String toString() {
        return nomCommune + " (" + codeDepartement + ", " + nomRegion + ") - population : " + populationTotale;
    }
}