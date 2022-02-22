package huongdoituong.buoi5;

public class intSquare {
    private double squareValue;

    public double getSquare(int value) {
        this.caculateSquare(value);
        return this.squareValue;
    }

    public int caculateSquare(int value) {
        this.squareValue = Math.pow(value, 5);
    }
}
