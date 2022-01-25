package huongdoituong.buoi4;

public class square {

    String soundFile;

    public void aquare(String soundFile) {
        this.soundFile = soundFile;
    }

    public void rotatet() {
        System.out.printf("Xoay hinh 360 do");
        this.playsound();
    }

    public void playsound() {
        System.out.printf("phat file" + this.soundFile);
    }
}
