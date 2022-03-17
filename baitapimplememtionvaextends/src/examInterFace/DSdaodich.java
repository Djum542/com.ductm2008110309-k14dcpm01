package src.examInterFace;

import java.util.Scanner;

public abstract class DSdaodich {
    protected double Magd;
    protected String Ngaygd;
    protected double SoLuong;
    protected double Dongia, ThanhTien;
    Scanner in = new Scanner(System.in);

    protected DSdaodich() {
        this.Magd = 0;
        this.Ngaygd = "";
        this.Dongia = 0;
        this.SoLuong = 0;
        this.ThanhTien = 0;

    }

    public DSdaodich(double magd, String ngaygd, double soLuong, double dongia, double thanhTien, Scanner in) {
        Magd = magd;
        Ngaygd = ngaygd;
        SoLuong = soLuong;
        Dongia = dongia;
        ThanhTien = thanhTien;
        this.in = in;
    }

    protected abstract void setMagd();

    protected abstract int getMagd();

    protected abstract void setNgaygd();

    protected abstract int getNgaygd();

    protected abstract void setDonGia();

    protected abstract int getDonGia();

    protected abstract void setSoLuong();

    protected abstract int getSoLuong();

    protected abstract void setThanhTien();

    protected abstract int getThanhTien();

    protected void nhap() {
        Scanner in = new Scanner(System.in);
        Magd = in.nextDouble();
        Ngaygd = in.nextLine();
        Dongia = in.nextDouble();
        SoLuong = in.nextDouble();
        ThanhTien = in.nextDouble();
    }

    @Override
    public String toString() {
        return "DSdaodich [Dongia=" + Dongia + ", Magd=" + Magd + ", Ngaygd=" + Ngaygd + ", SoLuong=" + SoLuong
                + ", ThanhTien=" + ThanhTien + ", in=" + in + "]";
    }
}
