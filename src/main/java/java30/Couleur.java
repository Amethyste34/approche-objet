package java30;

public enum Couleur {
    ROUGE,
    VERT,
    BLEU,
    JAUNE,
    NOIR;

    public static Couleur getCouleurDefaut() {
        return NOIR;
    }
}