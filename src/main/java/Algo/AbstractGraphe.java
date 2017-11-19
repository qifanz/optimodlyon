package Algo;

import Modele.Noeud;
import Modele.Plan;
import Modele.PointLivraison;
import Modele.Troncon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by flavi on 2017/11/18.
 */
public class AbstractGraphe {
    private Plan plan;
    private List<PointLivraison> pointLivraisons;
    private Map<Integer, Map<Integer, Double>> matPlan;
    private Map<Integer, Map<Integer, Double>> matAbstrait;

    public AbstractGraphe(Plan plan, List<PointLivraison> pointLivraisons) {
        this.plan = plan;
        this.pointLivraisons = pointLivraisons;
        Set<Troncon> troncons = plan.getListeTroncons();
        Set<Noeud> noeuds = plan.getListeNoeuds();

        matPlan=new HashMap<Integer, Map<Integer, Double>>();
        matAbstrait=new HashMap<Integer, Map<Integer, Double>>();


        for (Noeud noeud:noeuds) {
            matPlan.put(noeud.getId(),new HashMap<Integer, Double>());
        }

        for (Troncon troncon:troncons) {
            matPlan.get(troncon.getOrigine().getId()).put(troncon.getDestination().getId(),troncon.getLongueur());
        }

        for (PointLivraison pointLivraison:pointLivraisons) {
            matAbstrait.put(pointLivraison.getId(),new HashMap<Integer, Double>());
        }
    }

    public void abstraireGraphe() {

    }
}
