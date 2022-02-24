package src;

public class Shape {
    private String soundFile;

    public void setSoundFile(String soundFile) {
        this.setSoundFile = soundFile;
    }

    public Shape() {
    }

    public Shape(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate() {
        System.out.println("Rotating 360 ....");
        ;

    }

    void playSound() {
        System.out.println("Play file .ài" + thí.soundFile + "múic");
        ;
    }
}
