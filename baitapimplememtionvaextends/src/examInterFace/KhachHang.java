package examInterFace;

import java.util.Scanner;

public abstract class KhachHang {
    protected int MaKH, SoLuong;
    protected double DonGia, ThanhTien;
    protected String NgayHD, HoTenKH;
    Scanner in = new Scanner(System.in);

    protected KhachHang() {
        this.MaKH = 0;
        this.SoLuong = 0;
        this.DonGia = 0;
        this.ThanhTien = 0;
        this.NgayHD = "";
        this.HoTenKH = "";

    }

    public KhachHang(int maKH, int soLuong, double donGia, double thanhTien, String ngayHD, String hoTenKH,
            Scanner in) {
        MaKH = maKH;
        SoLuong = soLuong;
        DonGia = donGia;
        ThanhTien = thanhTien;
        NgayHD = ngayHD;
        HoTenKH = hoTenKH;
        this.in = in;
    }

    protected void setMaKH() {
        MaKH = MaKH;
    }

    protected int getmaKH() {
        return MaKH;
    }

    protected void setSoLuong() {
        SoLuong = SoLuong;
    }

    protected int getSoLuong() {
        return SoLuong;
    }

    protected void setDonGia() {
        DonGia = DonGia;
    }

    protected double getDonGia() {
        return DonGia;
    }

    protected void setThanhTien() {
        ThanhTien = ThanhTien;
    }

    protected double getThanhTien() {
        return ThanhTien;
    }

    protected void setNgayHD() {
        NgayHD = NgayHD;
    }

    protected String getNgayHD() {
        return NgayHD;
    }

    protected void setHoTenKH() {
        HoTenKH = HoTenKH;
    }

    protected String getHoTenKH() {
        return HoTenKH;
    }

    protected void nhap() {
        System.out.println(" Nhap ma khach hang");
        MaKH = in.nextInt();
        System.out.println("Nhap ho ten khach hang");
        HoTenKH = in.nextLine();
        System.out.println("Ngay lap hoa don");
        NgayHD = in.nextLine();
        System.out.println("So luong khach hang");
        SoLuong = in.nextInt();
        System.out.println("don gia");
        DonGia = in.nextDouble();

    }

    @Override
    public String toString() {
        return "KhachHang [DonGia=" + DonGia + ", HoTenKH=" + HoTenKH + ", MaKH=" + MaKH + ", NgayHD=" + NgayHD
                + ", SoLuong=" + SoLuong + ", ThanhTien=" + ThanhTien + ", in=" + in + "]";
    }

}
