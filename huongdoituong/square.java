package huongdoituong;

public class square {
    int hinhdang;
    String soundFile;

    public void aquare(String soundFile) {
        this.soundFile = soundFile;
    }

    public void rotatet() {

        System.out.printf("Xoay hinh 360 do");
        this.playsound();
    }

    public void playsound() {

        System.out.printf("phat file hinhvuong.aif" + this.soundFile);
    }
}
