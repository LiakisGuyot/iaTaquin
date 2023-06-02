package com.taquin.iataquin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grille {

    public int taille;

    public ArrayList<Integer> cases;

    public ArrayList<Agent> agents;

    public ArrayList<Integer> getNeighboors(int caseId) {

        ArrayList<Integer> voisins = new ArrayList<>();
        if (caseId - this.taille >= 0) {
            voisins.add(caseId - 3);
        }
        if (caseId + 3 < (this.taille * this.taille)) {
            voisins.add(caseId + 3);
        }
        if ((caseId + 1) % this.taille != 0) {
            voisins.add(caseId + 1);
        }
        
        return res;
    }

    public boolean isCompleted() {
        for (Agent a : this.agents) {
            if (!a.isAtGoal()) {
                return false;
            }
        }
        return true;
    }

    public

}
