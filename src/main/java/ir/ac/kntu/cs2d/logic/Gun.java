package ir.ac.kntu.cs2d.logic;

public class Gun {
    String name;
    int price;
    int damage;
    int MFA;
    double STR;
    int magazineCapacity;

    public Gun(String name, int price, int damage, int MFA, double STR, int magazineCapacity){
        this.name = name;
        this.price = price;
        this.damage = damage;
        this.MFA = MFA;
        this.STR = STR;
        this.magazineCapacity = magazineCapacity;
    }
}
