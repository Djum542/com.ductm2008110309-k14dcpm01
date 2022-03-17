package src.examInterFace;

import java.util.Scanner;

public abstract class HoaDon {
    private double Mahd;
    private double Ngayhd;
    private String TenKH;
    private double MaPhong;
    private double DonGia;

    private void setMahd() {
        Mahd = Mahd;
    }

    public double getMahd() {
        return Mahd;
    }

    private void setNgayhd() {
        Ngayhd = Ngayhd;
    }

    public double getNgayhd() {
        return Ngayhd;
    }

    private void setTenKH() {
        TenKH = TenKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    private void setMaPhong() {
        MaPhong = MaPhong;
    }

    public double getMaPhong() {
        return MaPhong;
    }

    private void setDonGia() {
        DonGia = DonGia;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ma hoa don");
        Mahd = in.nextDouble();
        System.out.println("Ngay hoa don");
        Ngayhd = in.nextDouble();
        System.out.println("Ten khach hang");
        TenKH = in.nextLine();
        System.out.println("Ma phòng ");
        MaPhong = in.nextDouble();
        System.out.println("Don gia");
        DonGia = in.nextDouble();
    }

    public HoaDon() {
        this.Mahd = 0;
        this.Ngayhd = 0;
        this.TenKH = "";
        this.MaPhong = 0;
        this.DonGia = 0;

    }

    public HoaDon(double mahd, double ngayhd, String tenKH, double maPhong, double donGia) {
        Mahd = mahd;
        Ngayhd = ngayhd;
        TenKH = tenKH;
        MaPhong = maPhong;
        DonGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDon [DonGia=" + DonGia + ", MaPhong=" + MaPhong + ", Mahd=" + Mahd + ", Ngayhd=" + Ngayhd
                + ", TenKH="
                + TenKH + "]";
    }

}
