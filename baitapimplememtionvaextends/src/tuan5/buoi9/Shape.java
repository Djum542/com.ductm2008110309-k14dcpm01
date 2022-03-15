package src.tuan5.buoi9;

public abstract class Shape {
    protected int x, y;

    Shape(int x, int y) {
        x = x;
        y = y;
    }

    public abstract void draw();

    public abstract void erase();

    public abstract void moveTo(int x, int y){
        erase();
        x = x;
        y =y;
        draw();
    }
}
