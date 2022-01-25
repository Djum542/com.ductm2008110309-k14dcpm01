package huongdoituong.buoi4;

public class Amoeba {
    // attribute
    String soundFile;

    public void Amoeba(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotatet() {
        System.out.println("rotating 360");
    }

    void playsound() {
        System.out.println("play amoeba.hif" + this.soundFile + "music");

    }
}
