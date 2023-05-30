package com.taquin.iataquin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grille {

    public int taille;

    public HashMap<Integer[], Case> cases;


    public Case getCase(int x, int y){
        Integer[] coords = {x, y};
        return this.cases.get(coords);
    }
    public ArrayList<Case> getNeighboors(Case c) {
        ArrayList<Integer> coords = c.getCoords();
        ArrayList<Case> res = new ArrayList<>();
        if (coords.get(1) + 1 <= this.taille) {
            res.add(this.getCase(coords.get(0), coords.get(1) + 1));
        }
        if (coords.get(1) - 1 >= 0) {
            res.add(this.getCase(coords.get(0), coords.get(1) - 1));
        }
        if (coords.get(0) + 1 <= this.taille) {
            res.add(this.getCase(coords.get(0) + 1, coords.get(1)));
        }
        if (coords.get(0) - 1 >= 0) {
            res.add(this.getCase(coords.get(0) - 1, coords.get(1)));
        }
        return res;
    }

}
