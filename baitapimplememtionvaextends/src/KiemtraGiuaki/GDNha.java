package KiemtraGiuaki;

import java.util.Scanner;

public class GDNha extends GiaoDich implements Nha {
    private static final int LoaiNha = 0;
    Scanner in = new Scanner(System.in);
    int LN, DC;

    @Override
    public void LoaiNha() {
        System.out.println("loai nha");
    }

    @Override
    public void DiaChi() {
        System.out.println("Dia chi");
    }

    public GDNha() {
        super();
        this.LoaiNha();
        this.DiaChi();
    }

    public GDNha(double maGD, double donGia, double dienTich, String ngayGD, String loaiDat, Scanner in) {
        super(maGD, donGia, dienTich, ngayGD, loaiDat, in);
        LoaiNha();
        DiaChi();
    }

    public void nhap() {
        super.nhap();
        LN = in.nextInt();
        DC = in.nextInt();
    }

    public void TTien() {
        double TT;
        if (LoaiNha == 1) {
            TT = this.DienTich * this.DonGia;
        } else {
            TT = this.DienTich * this.DonGia * 90 / 100;
        }

    }

    @Override
    public String toString() {
        return "GDNha [DC=" + DC + ", LN=" + LN + "]" + toString();
    }
}
