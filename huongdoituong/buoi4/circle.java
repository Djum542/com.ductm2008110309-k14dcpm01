package huongdoituong.buoi4;

public class circle {

    String SoundFile;

    public void circle(String SoundFile) {
        this.SoundFile = SoundFile;
    }

    void rotatet() {

        System.out.println("Xoay hinh  360 do");
    }

    void playsound() {

        System.out.println("phat file hinhtron.aif" + this.SoundFile);
    }
}
