package huongdoituong.buoi4;

public class triagle {
    int hinhdang;
    String soundFile;

    public void triagle(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotatet() {

        System.out.print("xoay hinh 360 do");
        this.playsound();
    }

    void playsound() {

        System.out.println("phat file hinhtamgiac.aif" + this.soundFile);
    }
}
