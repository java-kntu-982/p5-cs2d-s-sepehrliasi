package ir.ac.kntu.cs2d.logic;

enum TEAM {
    CT,
    T
}

public class Player {
    private String name;
    private int money = 800;
    private int heart = 100;
    private Colt colt;
    private Rifle rifle;
    private Gun currentGun;
    private TEAM team;
    private boolean bomb = false;
    private boolean armor = false;

    public Player(String name, TEAM team){
        this.name = name;
        this.team = team;
        if (team == TEAM.T) {
            colt = (Colt) new Glock();
        } else {
            colt = (Colt) new USP();
        }
        currentGun = colt;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public void setHeart(int change){
        heart += change;
    }

    public void setColt(Colt colt){
        this.colt = colt;
    }

    public void setRifle(Rifle rifle){
        this.rifle = rifle;
    }

    public void setCurrentGun(int input){
        switch (input) {
            case 2:
                currentGun = colt;
                break;
            case 3:
                currentGun = rifle;
                break;
        }
    }

    public void setBomb(boolean bomb){
        this.bomb = bomb;
    }

    public void setArmor(boolean armor){
        if (money >= 1000) {
            this.armor = armor;
            heart += 80;
        } else {
            System.out.println("Not enough money");
        }
    }
}