package tuan5.buoi9;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int r) {
        super(x, y);
        radius = r;
    }

    @Override
    public void erase() {
        // TODO Auto-generated method stub
        System.out.println("Erase circle at" + x + "," + y);
    }

    @Override
    public void draw(int x, int y) {

        System.out.println("Draw circle at" + x + "," + y);
    }

    @Override
    public void moveTo(int x, int y) {
        // TODO Auto-generated method stub

    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub

    }

}
