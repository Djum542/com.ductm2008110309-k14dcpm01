package src.KiemtraGiuaki;

import java.util.Scanner;

public abstract class GiaoDich {
    protected double MaGD, DonGia, DienTich;
    protected String NgayGD;

    public GiaoDich() {
        this.MaGD = 0;
        this.NgayGD = "";
        this.DonGia = 0;

        this.DienTich = 0;

    }

    public GiaoDich(double maGD, double donGia, double dienTich, String ngayGD, String loaiDat, Scanner in) {
        MaGD = maGD;
        DonGia = donGia;
        DienTich = dienTich;
        NgayGD = ngayGD;

    }

    public void setMaGD() {
        MaGD = MaGD;
    }

    public double getMaGD() {
        return MaGD;
    }

    public void setDonGia() {
        DonGia = DonGia;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDienTich() {
        DienTich = DienTich;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setNgayGD() {
        NgayGD = NgayGD;
    }

    public String getNgayGD() {
        return NgayGD;
    }

    public void nhap() {
        Scanner in = new Scanner(System.in);
        MaGD = in.nextDouble();
        NgayGD = in.nextLine();
        DonGia = in.nextDouble();

        DienTich = in.nextDouble();
    }

    @Override
    public String toString() {
        return "GiaoDich [DienTich=" + DienTich + ", DonGia=" + DonGia + ", MaGD=" + MaGD + ", NgayGD=" + NgayGD + "]";
    }

}
