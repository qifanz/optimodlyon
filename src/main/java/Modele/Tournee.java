package Modele;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flavi on 2017/11/18.
 */
public class Tournee {
    private List<Itineraire> listeItineraires;
    private Noeud entrepote;
    private List<PointLivraison> listePointLivraisons;
    private double heureDeDepart;

    public Tournee(Noeud entrepote, double heureDeDepart) {
        this.entrepote = entrepote;
        this.heureDeDepart = heureDeDepart;
        listeItineraires=new ArrayList<Itineraire>();
        listePointLivraisons=new ArrayList<PointLivraison>();
    }

    public void addPointLivraisons (PointLivraison pointLivraison) {
        listePointLivraisons.add(pointLivraison);
    }


}
