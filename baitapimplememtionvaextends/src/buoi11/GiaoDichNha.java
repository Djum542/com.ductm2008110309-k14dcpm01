package buoi11;

import java.util.Date;

import javax.print.DocFlavor.STRING;

public class GiaoDichNha extends GiaoDich {
    private String DiaChi;
    private String LoaiNha;

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setLoaiNha(String loaiNha) {
        LoaiNha = loaiNha;
    }

    public String getLoaiNha() {
        return LoaiNha;
    }

    public GiaoDichNha(String maGD, Date ngayGD, String donGia, String dienTich, String diaChi, String loaiNha) {
        super(maGD, ngayGD, donGia, dienTich);
        DiaChi = diaChi;
        LoaiNha = loaiNha;
    }

    @Override
    public String toString() {
        return "GiaoDichNha [DiaChi=" + DiaChi + ", LoaiNha=" + LoaiNha + "]" + super.toString();
    }

    @Override
    public double TinhTien() {
        double tien;
        if (this.LoaiNha.equals("Caocap")) {
            tien = this.getDienTich() * this.getDonGia();
        } else {
            tien = this.getDienTich() * this.getDonGia() * 0.9;
        }
        return tien;
    }

}
