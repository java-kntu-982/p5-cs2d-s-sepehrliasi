package ir.ac.kntu.cs2d.logic;

enum ACCESSIBILITY{
    CT,
    T,
    BOTH
}

public class Rifle extends Gun {
    ACCESSIBILITY accessibility;

    public Rifle(String name, int price, int damage, int MFA, double STR, int magazineCapacity, ACCESSIBILITY accessibility){
        super(name, price, damage, MFA, STR, magazineCapacity);
        this.accessibility = accessibility;
    }
}
