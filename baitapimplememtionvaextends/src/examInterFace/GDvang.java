package src.examInterFace;

import java.util.Scanner;

public class GDvang extends DSdaodich {
    private String LoaiVang;

    public GDvang() {
        super();
        this.LoaiVang = "";

    }

    public GDvang(double magd, String ngaygd, double soLuong, double dongia, double thanhTien, Scanner in,
            String loaiVang) {
        super(magd, ngaygd, soLuong, dongia, thanhTien, in);
        LoaiVang = loaiVang;
    }

    public void setLoaiVang() {
        LoaiVang = LoaiVang;

    }

    public String getLoaiVang() {
        return LoaiVang;

    }

    public void nhap() {
        super.nhap();
        System.out.println("Loại vàng:");
        this.LoaiVang = in.nextLine();
    }

    @Override
    protected void setThanhTien() {
        // TODO Auto-generated method stub

    }

    @Override
    protected int getThanhTien() {
        return (int) (this.ThanhTien = this.Dongia * this.SoLuong);
    }

    @Override
    protected void setDonGia() {
        // TODO Auto-generated method stub

    }

    @Override
    protected int getDonGia() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected void setMagd() {
        // TODO Auto-generated method stub

    }

    @Override
    protected int getMagd() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected void setNgaygd() {
        // TODO Auto-generated method stub

    }

    @Override
    protected int getNgaygd() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    protected void setSoLuong() {
        // TODO Auto-generated method stub

    }

    @Override
    protected int getSoLuong() {
        // TODO Auto-generated method stub
        return 0;
    }
}
