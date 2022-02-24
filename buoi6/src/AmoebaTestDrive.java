package src;

public class AmoebaTestDrive {
    public static void main(String[] args) {
        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(5);
        amoeba.setxPoint(8);
        amoeba.rotate();
        amoeba.setSoundFile();
        amoeba.playSound();
    }
}
