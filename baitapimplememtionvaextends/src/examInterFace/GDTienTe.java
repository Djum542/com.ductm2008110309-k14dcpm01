package src.examInterFace;

import java.util.Scanner;

public class GDTienTe extends DSdaodich {
    private float TiGia;
    private int LoaiTienTe;

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

    @Override
    protected void setThanhTien() {
        // TODO Auto-generated method stub

    }

    @Override
    protected int getThanhTien() {
        // TODO Auto-generated method stub
        return 0;
    }

    public GDTienTe() {
        super();
        this.LoaiTienTe = 0;
        this.TiGia = 0;

    }

    public GDTienTe(double magd, String ngaygd, double soLuong, double dongia, double thanhTien, Scanner in,
            float tiGia, float loaiTienTe) {
        super(magd, ngaygd, soLuong, dongia, thanhTien, in);
        this.TiGia = tiGia;
        this.LoaiTienTe = loaiTienTe;
    }

    public float getTiGia() {
        return 0;
    }

    public void setTiGia() {
        TiGia = TiGia;

    }

    public void setLoaiTienTe() {
        LoaiTienTe = LoaiTienTe;
    }

    public int getLoaiTienTe() {
        return 0;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Tỉ giá:");
        TiGia = in.nextInt();
        System.out.println("Loại tiền tệ:");
        LoaiTienTe = in.nextInt();
    }

    public double ThanhTien() {
        if (LoaiTienTe) {
            return this.ThanhTien = this.Dongia * this.SoLuong;

        } else {
            return this.Dongia * this.SoLuong * this.TiGia;

        }

    }

    @Override
    public String toString() {
        return "GDTienTe [LoaiTienTe=" + LoaiTienTe + ", TiGia=" + TiGia + "]" + toString(DSdaodich);
    }
}
