package ir.ac.kntu.cs2d.logic;

import java.util.ArrayList;

public class ShopMenu {
    private Player player;

    public void shop(){
        System.out.println("name: " + player.getName());
        System.out.println("your money: " + player.getMoney());
        RiflesArray riflesArray = new RiflesArray();
        ArrayList<Rifle> rifles = riflesArray.getRifles();
        int t = 0;
        for (int i = 0; i < 6; i++) {
            if (player.getTeam().toString() == rifles.get(i).getAccessibility().toString() || rifles.get(i).getAccessibility() == ACCESSIBILITY.BOTH) {
                if (rifles.get(i).getPrice() <= player.getMoney()) {
                    t++;
                    System.out.println(t + "." + rifles.get(i));
                }
            }
        }
        ColtArray coltArray = new ColtArray();
        ArrayList<Colt> colts = coltArray.getColts();
        for (int i = 0; i < 3; i++) {
            if (player.getMoney() >= colts.get(i).getPrice()) {
                t++;
                System.out.println(t + "." + colts.get(i));
            }
        }
        if (player.getMoney() >= 1000) {
            t++;
            System.out.println(t + ". armor");
        }
        if (t == 0) {
            System.out.println("Not enough money to purchase!");
        }
    }
}
