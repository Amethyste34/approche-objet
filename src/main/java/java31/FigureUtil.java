package java31;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class FigureUtil {
    private static HashMap<String, Figure> figures;

    private static Point getRandomPoint() throws DessinHorsLimiteException {
        Random rand = new Random();
        return new Point(rand.nextInt(98), rand.nextInt(98));
    }

    private static Couleur getRandomCouleur(Random rand) throws DessinHorsLimiteException {
        Couleur[] c = Couleur.values();
        return c[rand.nextInt(c.length)];
    }

    public static Rond getRandomRond() throws DessinHorsLimiteException {
        Random rand = new Random();
        Point p = getRandomPoint();
        return new Rond(p, rand.nextInt(100 - Math.max(p.getX(), p.getY())), getRandomCouleur(rand));
    }

    public static Rectangle getRandomRectangle() throws DessinHorsLimiteException {
        Random rand = new Random();
        Point p = getRandomPoint();
        return new Rectangle(p, rand.nextInt(100 - p.getX()), rand.nextInt(100 - p.getY()), getRandomCouleur(rand));
    }

    public static Carre getRandomCarre() throws DessinHorsLimiteException {
        Random rand = new Random();
        Point p = getRandomPoint();
        return new Carre(p, rand.nextInt(100 - Math.max(p.getX(), p.getY())), getRandomCouleur(rand));
    }

    public static CarreHerite getRandomCarreHerite() throws DessinHorsLimiteException {
        Random rand = new Random();
        Point p = getRandomPoint();
        return new CarreHerite(p, rand.nextInt(100 - Math.max(p.getX(), p.getY())), getRandomCouleur(rand));
    }

    public static Segment getRandomSegment() throws DessinHorsLimiteException {
        Random rand = new Random();
        Point p = getRandomPoint();
        boolean h = rand.nextBoolean();
        return new Segment(p, (h ? rand.nextInt(100 - p.getX()) : rand.nextInt(100 - p.getY())), h, getRandomCouleur(rand));
    }

    public static Figure getRandomFigure() throws DessinHorsLimiteException {
        Random rand = new Random();
        return switch (rand.nextInt(5)) {
            case 0 -> getRandomCarre();
            case 1 -> getRandomCarreHerite();
            case 2 -> getRandomRectangle();
            case 3 -> getRandomRond();
            default -> getRandomSegment();
        };
    }

    public static Surfacable getRandomSurfacable() throws DessinHorsLimiteException {
        Random rand = new Random();
        return switch (rand.nextInt(4)) {
            case 0 -> getRandomCarre();
            case 1 -> getRandomCarreHerite();
            case 2 -> getRandomRectangle();
            default -> getRandomRond();
        };
    }

    public static Collection<Point> getPoints(Collection<Figure> figures) {
        HashSet<Point> points = new HashSet<>();

        for (Figure figure : figures) {
            points.addAll(figure.getPoints());
        }

        return points;
    }

    public static Collection<Figure> genere(int nbFigures) throws DessinHorsLimiteException {
        Collection<Figure> figures = new HashSet<>(nbFigures);

        for (int i = 0; i < nbFigures; i++) {
            figures.add(getRandomFigure());
        }

        return figures;
    }

    public static Figure getFigureEn(Point p, Dessin d) {
        Iterator<Figure> figures = d.getFigures().iterator();
        while (figures.hasNext()) {
            Figure figure = figures.next();
            if (figure.couvre(p)) {
                figures.remove();
                return figure;
            }
        }
        return null;
    }

    public static void afficheFigureEn(Point p, Dessin d) {
        Figure figure = getFigureEn(p, d);
        if (figure != null) {
            System.out.println("Point " + p + " est dans " + figure);
        } else {
            System.out.println("Point " + p + " n'est dans aucune figure du dessin");
        }
    }

    public static Collection<Figure> trieProcheOrigine(Dessin d) {
//        ArrayList<Figure> list = new ArrayList<>(d.getFigures());
//        Collections.sort(list);
//        return list;
        return new TreeSet<>(d.getFigures());
    }

    public static Collection<Surfacable> trieDominant(Dessin d) {
        ArrayList<Surfacable> list = new ArrayList<>();
        for (Figure figure : d.getFigures()) {
            if (Surfacable.class.isAssignableFrom(figure.getClass())) {
                list.add((Surfacable) figure);
            }
        }
        list.sort(new Comparator<>() {
            @Override
            public int compare(Surfacable o1, Surfacable o2) {
                if (o1.surface() > o2.surface()) {
                    return -1;
                } else if (o1.surface() < o2.surface()) {
                    return 1;
                }
                return 0;
            }
        });
        return list;
    }

    public static Figure createRandomFigure(String key) throws DessinHorsLimiteException {
        Figure figure = getRandomFigure();
        if (figures == null) {
            figures = new HashMap<>();
        }
        figures.put(key, figure);
        return figure;
    }

    public static Figure get(String key) {
        if (figures == null) {
            return null;
        }
        return figures.get(key);
    }

    public static void sauvegarde(Dessin dessin, String nomFichier) {
        try (PrintWriter writer = new PrintWriter(nomFichier)) {
            for (Figure fig : dessin.getFigures()) {
                String ligne = switch (fig.getClass().getSimpleName()) {
                    case "Carre" -> {
                        Carre c = (Carre) fig;
                        yield "Carre; x=" + c.getPointBasGauche().getX()
                                + "; y=" + c.getPointBasGauche().getY()
                                + "; cote=" + (c.getPointHautDroit().getX() - c.getPointBasGauche().getX())
                                + "; couleur=" + c.getCouleur();
                    }
                    case "CarreHerite" -> {
                        CarreHerite ch = (CarreHerite) fig;
                        yield "Carre; x=" + ch.getpointBasGauche().getX()
                                + "; y=" + ch.getpointBasGauche().getY()
                                + "; cote=" + (ch.getPointHautDroit().getX() - ch.getpointBasGauche().getX())
                                + "; couleur=" + ch.getCouleur();
                    }
                    case "Rectangle" -> {
                        Rectangle r = (Rectangle) fig;
                        yield "Rectangle; x=" + r.getpointBasGauche().getX()
                                + "; y=" + r.getpointBasGauche().getY()
                                + "; largeur=" + (r.getPointHautDroit().getX() - r.getpointBasGauche().getX())
                                + "; hauteur=" + (r.getPointHautDroit().getY() - r.getpointBasGauche().getY())
                                + "; couleur=" + r.getCouleur();
                    }
                    case "Rond" -> {
                        Rond rond = (Rond) fig;
                        yield "Rond; x=" + rond.initialPoint.getX()
                                + "; y=" + rond.initialPoint.getY()
                                + "; rayon=" + (int) Math.sqrt(rond.surface() / Math.PI)
                                + "; couleur=" + rond.getCouleur();
                    }
                    case "Segment" -> {
                        Segment s = (Segment) fig;
                        int dx = s.getPoints().stream().mapToInt(Point::getX).max().orElse(0) - s.initialPoint.getX();
                        int dy = s.getPoints().stream().mapToInt(Point::getY).max().orElse(0) - s.initialPoint.getY();
                        boolean horizontal = dy == 0;
                        yield "Segment; x=" + s.initialPoint.getX()
                                + "; y=" + s.initialPoint.getY()
                                + "; longueur=" + (horizontal ? dx : dy)
                                + "; horizontal=" + horizontal
                                + "; couleur=" + s.getCouleur();
                    }
                    default -> "Inconnue";
                };
                writer.println(ligne);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Dessin charge(String nomFichier) {
        Dessin dessin = new Dessin();
        try (Scanner scanner = new Scanner(new File(nomFichier))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(";");
                String type = tokens[0].trim();
                Map<String, String> map = new HashMap<>();
                for (int i = 1; i < tokens.length; i++) {
                    String[] kv = tokens[i].trim().split("=");
                    map.put(kv[0], kv[1]);
                }

                int x = Integer.parseInt(map.get("x"));
                int y = Integer.parseInt(map.get("y"));
                Couleur couleur = Couleur.valueOf(map.get("couleur"));

                switch (type) {
                    case "Carre" -> {
                        int cote = Integer.parseInt(map.get("cote"));
                        dessin.add(new Carre(new Point(x, y), cote, couleur));
                    }
                    case "Rectangle" -> {
                        int largeur = Integer.parseInt(map.get("largeur"));
                        int hauteur = Integer.parseInt(map.get("hauteur"));
                        dessin.add(new Rectangle(new Point(x, y), largeur, hauteur, couleur));
                    }
                    case "Rond" -> {
                        int rayon = Integer.parseInt(map.get("rayon"));
                        dessin.add(new Rond(new Point(x, y), rayon, couleur));
                    }
                    case "Segment" -> {
                        int longueur = Integer.parseInt(map.get("longueur"));
                        boolean horizontal = Boolean.parseBoolean(map.get("horizontal"));
                        dessin.add(new Segment(new Point(x, y), longueur, horizontal, couleur));
                    }
                    default -> System.out.println("Type inconnu: " + type);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dessin;
    }

}