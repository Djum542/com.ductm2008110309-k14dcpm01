package buoi11;

import java.util.Date;

public class GiaoDichDat extends GiaoDich {
    private String LoaiDat;

    public void setLoaiDat(String loaiDat) {
        LoaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return LoaiDat;
    }

    @Override
    public double TinhTien() {
        double tien;
        if (this.LoaiDat == "B" && this.LoaiDat == "C") {
            tien = this.getDonGia() * this.getDienTich();
        } else {
            tien = this.getDonGia() * getDienTich() * 1.5;
        }
        return tien;
    }

    public GiaoDichDat(String maGD, Date ngayGD, String donGia, String dienTich, String loaiDat) {
        super(maGD, ngayGD, donGia, dienTich);
        LoaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return "GiaoDichDat [LoaiDat=" + LoaiDat + "]" + super.toString();
    }

}
