import java.util.Scanner;

public class Ngoaithanh extends Chuyenxe {
    private String NoiDen;
    private int SoNgay;
    Scanner in = new Scanner(System.in);

    public void setNoiDen(String noiDen) {
        NoiDen = noiDen;
    }

    public String getNoiDen() {
        return NoiDen;
    }

    public void setSoNgay(int soNgay) {
        SoNgay = soNgay;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public Ngoaithanh() {
        super();
        this.NoiDen = "";
        this.SoNgay = 0;
    }

    public Ngoaithanh(String ma, String name, String sx, double dt, String nd, int sn) {
        super(ma, name, sx, dt);
        this.NoiDen = nd;
        this.SoNgay = sn;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhập nơi đến");
        this.NoiDen = in.nextLine();
        System.out.println("Nhập vào số ngày");
        this.SoNgay = in.nextInt();
    }

    @Override
    public String toString() {
        return "Ngoaithanh [NoiDen=" + NoiDen + ", SoNgay=" + SoNgay + "]" + super.toString();
    }

}