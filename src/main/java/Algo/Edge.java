package Algo;

import Modele.Noeud;

/**
 * Created by flavi on 2017/11/18.
 */
public class Edge {
    private int idNoeud;
    private double longueur;
    private Edge edgeAdjacent;

    public Edge(int idNoeud, double longueur) {
        this.idNoeud = idNoeud;
        this.longueur = longueur;
        edgeAdjacent=null;
    }

    public int getIdNoeud() {
        return idNoeud;
    }

    public double getLongueur() {
        return longueur;
    }

    public Edge getEdgeAdjacent() {
        return edgeAdjacent;
    }
}
