package src.KiemtraGiuaki;

import java.util.Scanner;

public class GDDat extends GiaoDich implements Dat {
    Scanner in = new Scanner(System.in);
    String LD, TT;

    @Override
    public void loaiDat() {
        System.out.println("Loai dat");

    }

    public GDDat() {
        super();
        this.LD = "";
    }

    public GDDat(double maGD, double donGia, double dienTich, String ngayGD, String loaiDat, Scanner in) {
        super(maGD, donGia, dienTich, ngayGD, loaiDat, in);
        LD = loaiDat;
    }

    public void nhap() {
        super.nhap();
        LD = in.nextLine();

    }

    @Override
    public String toString() {
        return "GDDat [LD=" + LD + "]" + toString();
    }

    public void TTien() {
        if (loaiDat(A)) {

            TT = this.DienTich * this.DonGia * 1.5;
        } else {
            TT = this.DonGia * this.DienTich;

        }

    }
}
