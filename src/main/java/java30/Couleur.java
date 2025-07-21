package java30;

public enum Couleur {
    ROUGE('R'),
    VERT('V'),
    BLEU('B'),
    JAUNE('J'),
    NOIR('N');

    private final char code;

    Couleur (char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }

    public static Couleur getCouleurDefaut() {
        return NOIR;
    }

    public static Couleur getCouleurAleatoire() {
        Couleur[] valeurs = Couleur.values();
        return  valeurs[(int) (Math.random() * valeurs.length)];
    }
}
