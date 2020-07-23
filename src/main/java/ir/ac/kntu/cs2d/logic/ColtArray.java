package ir.ac.kntu.cs2d.logic;

import java.util.ArrayList;

public class ColtArray {
    ArrayList<Colt> colts = new ArrayList<>();

    public ArrayList<Colt> getColts(){
        return colts;
    }

    public ColtArray(){
        colts.add(new Glock());
        colts.add(new USP());
        colts.add(new Deagle());
    }
}
