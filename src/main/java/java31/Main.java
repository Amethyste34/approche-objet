package java31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DessinHorsLimiteException {
        Dessin d1 = new Dessin(FigureUtil.genere(5));
        FigureUtil.sauvegarde(d1, "dessin.txt");

        System.out.println("Sauvegarde terminée.\nModifiez le fichier texte manuellement, puis appuyez sur Entrée...");
        new Scanner(System.in).nextLine();

        Dessin d2 = FigureUtil.charge("dessin.txt");

        System.out.println("Figures chargées :");
        for (Figure f : d2.getFigures()) {
            f.affiche();
        }
    }
}
