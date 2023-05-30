package com.taquin.iataquin;

import java.util.ArrayList;
import java.util.List;

public class Case {

    public boolean occupied;
    public int x;
    public int y;

    public ArrayList<Integer> getCoords() {
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(this.x);
        res.add(this.y);

        return res;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

}
