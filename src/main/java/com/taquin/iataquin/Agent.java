package com.taquin.iataquin;

public class Agent {

    public int currentTile;
    public int goal;
    public Grille currentGrid;

    public boolean isAtGoal () {
        return this.goal == this.currentTile;
    }

}
