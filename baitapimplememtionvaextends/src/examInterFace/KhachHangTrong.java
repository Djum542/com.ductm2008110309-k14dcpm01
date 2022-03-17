package src.examInterFace;

import java.util.Scanner;

public class KhachHangTrong extends KhachHang {
    private int LoaiKH, DinhMuc;

    public KhachHangTrong() {
        super();
        this.LoaiKH = 0;
        this.DinhMuc = 0;

    }

    public KhachHangTrong(int maKH, int soLuong, double donGia, double thanhTien, String ngayHD, String hoTenKH,
            Scanner in, int loaiKH, int dinhMuc) {
        super(maKH, soLuong, donGia, thanhTien, ngayHD, hoTenKH, in);
        LoaiKH = loaiKH;
        DinhMuc = dinhMuc;
    }

    public void setloaiKH() {
        LoaiKH = LoaiKH;
    }

    public int getloaiKH() {
        return LoaiKH;
    }

    public void setDinhMuc() {
        DinhMuc = DinhMuc;

    }

    public int getDinhMuc() {
        return DinhMuc;
    }

    public void nhap() {
        super.nhap();
        System.out.println("1. Sinh hoat, 2. Kinh doanh, 3. san xuat");
        LoaiKH = in.nextInt();
        System.out.println("Dinh muc");
        DinhMuc = in.nextInt();
    }

    public void thanhTien() {
        if (SoLuong <= DinhMuc) {
            return this.thanhTien = this.DonGia * this.SoLuong;

        } else {
            return this.thanhTien = this.DinhMuc * this.DonGia + (this.SoLuong - this.DinhMuc) * this.DonGia * 2.5;

        }

    }

    @Override
    public String toString() {
        String temp;
        if (LoaiKH == 1) {
            temp = "sinh hoat";
        } else {
            if (LoaiKH == 2) {
                temp = "kinh doanh";
            } else {
                temp = "san xuat";
            }
        }
        return "KhachHangTrong [DinhMuc=" + DinhMuc + ", LoaiKH=" + LoaiKH + "]";
    }
}
