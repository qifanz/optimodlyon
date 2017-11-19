package Modele;

/**
 * Created by flavi on 2017/11/18.
 */
public class Noeud {
    private int id;
    private int x;
    private int y;

    public Noeud(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
