package ir.ac.kntu.cs2d.logic;

enum TEAM{
    CT,
    T
}
public class Player {
    String name;
    int money = 800;
    int heart = 100;
    Colt colt;
    Rifle rifle;
    Gun currentGun;
    TEAM team;

    public Player(String name, TEAM team){
        this.name = name;
        this.team = team;
        if(team == TEAM.T){
            colt = (Colt) new Glock();
        }else{
            colt = (Colt) new USP();
        }
        currentGun = colt;
    }
}