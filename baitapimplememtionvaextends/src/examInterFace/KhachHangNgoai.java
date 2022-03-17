package src.examInterFace;

import java.util.Scanner;

public class KhachHangNgoai extends KhachHang {
    private String QuocTich;
    private Object thanhTien;

    public KhachHangNgoai() {
        super();
        this.QuocTich = "";
    }

    public KhachHangNgoai(int maKH, int soLuong, double donGia, double thanhTien, String ngayHD, String hoTenKH,
            Scanner in, String quocTich) {
        super(maKH, soLuong, donGia, thanhTien, ngayHD, hoTenKH, in);
        QuocTich = quocTich;
    }

    public void setQuocTich() {
        QuocTich = QuocTich;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void nhap() {
        super.nhap();
        this.QuocTich = "";

    }

    @Override
    public String toString() {
        return "KhachHangNgoai [QuocTich=" + QuocTich + "]" + toString();
    }

    public Object thanhTien() {
        return this.thanhTien = this.SoLuong * this.DonGia;
    }
}
