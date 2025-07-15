package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Premier constructeur : nom et prénom
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Second constructeur : nom, prénom et adresse
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    // Méthode pour afficher nom/prénom avec nom en majuscules
    public void afficherNomPrenom() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    // Setter pour modifier le nom
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // Setter pour modifier le prénom
    public void setPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    // Setter pour modifier l’adresse
    public void setAdresse(AdressePostale nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }

    // Getter pour nom
    public String getNom() {
        return nom;
    }

    // Getter pour prénom
    public String getPrenom() {
        return prenom;
    }

    // Getter pour adresse
    public AdressePostale getAdresse() {
        return adresse;
    }
}