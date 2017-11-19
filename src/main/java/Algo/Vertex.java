package Algo;

import Modele.Noeud;

/**
 * Created by flavi on 2017/11/18.
 */
public class Vertex {
    private int idVertex;
    private Edge edgeAdjacent;

    public Vertex(int idVertex) {
        this.idVertex = idVertex;
        edgeAdjacent=null;
    }

    public int getIdVertex() {
        return idVertex;
    }

    public Edge getEdgeAdjacent() {
        return edgeAdjacent;
    }

    public void addEdge (int id, double longueur) {
        if (edgeAdjacent==null) {
            edgeAdjacent=new Edge(id,longueur);
        }
        else {
            Edge cur=edgeAdjacent;
            while (cur.getEdgeAdjacent()!=null) {
                cur=cur.getEdgeAdjacent();
            }
         //   cur.getEdgeAdjacent()=new Edge(id,longueur);
        }
    }
}
