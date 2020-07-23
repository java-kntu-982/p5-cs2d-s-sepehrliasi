package ir.ac.kntu.cs2d.logic;

public class Box extends MyObject {
    private boolean shotPass;

    public Box(double x, double y, double width, double height, String color){
        super(x, y, width, height, color);
        if (color == "grey") {
            shotPass = true;
        } else {
            shotPass = false;
        }
    }
}
