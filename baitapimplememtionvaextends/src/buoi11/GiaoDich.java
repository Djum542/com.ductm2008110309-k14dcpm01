package buoi11;

import java.util.Date;

public abstract class GiaoDich {
    private String MaGD;
    private Date NgayGD;
    private String DonGia;
    private String DienTich;

    public void setMaGD(String maGD) {
        MaGD = maGD;
    }

    public String getMaGD() {
        return MaGD;
    }

    public void setNgayGD(Date ngayGD) {
        NgayGD = ngayGD;
    }

    public Date getNgayGD() {
        return NgayGD;
    }

    public void setDonGia(String donGia) {
        DonGia = donGia;
    }

    public String getDienTich() {
        return DienTich;
    }

    public void setDienTich(String dienTich) {
        DienTich = dienTich;
    }

    public String getDonGia() {
        return DonGia;
    }

    public GiaoDich(String maGD, Date ngayGD, String donGia, String dienTich) {
        MaGD = maGD;
        NgayGD = ngayGD;
        DonGia = donGia;
        DienTich = dienTich;
    }

    public GiaoDich() {

    }

    public double TinhTien() {
        return 0;
    }

    @Override
    public String toString() {
        return "GiaoDich [DienTich=" + DienTich + ", DonGia=" + DonGia + ", MaGD=" + MaGD + ", NgayGD=" + NgayGD + "]";
    }

}
