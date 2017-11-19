package Modele;

/**
 * Created by flavi on 2017/11/18.
 */
public class PointLivraison extends Noeud {
    private double heureDebut;
    private double heureFin;

    public double getHeureDebut() {
        return heureDebut;
    }

    public double getHeureFin() {
        return heureFin;
    }

    public PointLivraison(Long id, int x, int y, double heureDebut, double heureFin) {

        super(id, x, y);
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }
}
