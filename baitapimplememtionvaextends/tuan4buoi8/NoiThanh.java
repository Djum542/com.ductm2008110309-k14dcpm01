package tuan4buoi8;

import java.util.Scanner;

public class NoiThanh extends ChuyenXe {
    private double SoKM;
    private String SoTuyen;
    Scanner in = new Scanner(System.in);

    public void setSoKM(double soKM) {
        SoKM = soKM;
    }

    public double getSoKM() {
        return SoKM;
    }

    public void setSoTuyen(String soTuyen) {
        SoTuyen = soTuyen;
    }

    public String getSoTuyen() {
        return SoTuyen;
    }

    public NoiThanh() {
        super();
        this.SoKM = 0;
        this.SoTuyen = "";

    }

    public NoiThanh(String ma, String name, String sx, double dt, double skm, String st) {
        super(ma, name, sx, dt);
        this.SoKM = 5000;
        this.SoTuyen = "";
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhập số kilometer");
        this.SoKM = in.nextDouble();
        this.SoTuyen = in.nextLine();

    }

    @Override
    public String toString() {
        return "NoiThanh [SoKM=" + SoKM + ", SoTuyen=" + SoTuyen + "]" + super.toString();
    }

}
