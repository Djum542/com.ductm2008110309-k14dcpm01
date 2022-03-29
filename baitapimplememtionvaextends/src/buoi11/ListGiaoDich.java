package buoi11;

import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.List;

public class ListGiaoDich {
    private List ds = new ArrayList<GiaoDich>();
    private int soluomgGiaoDichDat;
    private int soluongGiaoDichNha;

    public void setDs(List ds) {
        this.ds = ds;
    }

    public List getDs() {
        return ds;
    }

    public void setSoluomgGiaoDichDat(int soluomgGiaoDichDat) {
        this.soluomgGiaoDichDat = soluomgGiaoDichDat;
    }

    public int getSoluomgGiaoDichDat() {
        return soluomgGiaoDichDat;
    }

    public void setSoluongGiaoDichNha(int soluongGiaoDichNha) {
        this.soluongGiaoDichNha = soluongGiaoDichNha;
    }

    public int getSoluongGiaoDichNha() {
        return soluongGiaoDichNha;
    }

    public void Them(GiaoDich giaoDich) {
        ds.add(giaoDich);

    }

    public void inDanhSach() {
        for (GiaoDich giaoDich : ds) {
            System.out.println(giaoDich);
        }
    }

    public void TinhTongSLTungLoai() {
        for (GiaoDich giaoDich : ds) {
            if (giaoDich instanceof GiaoDichDat) {
                this.soluomgGiaoDichDat++;
            } else {
                this.soluongGiaoDichNha++;
            }
        }
    }

    public double TinhTBTienGDDat() {
        double tienGDDat = 0.0;
        int dem = 0;

        for (GiaoDich giaoDich : ds) {
            if (giaoDich instanceof GiaoDichDat) {
                dem++;
                tienGDDat += giaoDich.TinhTien();
            } else {

            }

        }
        return tienGDDat / dem;
    }

    public GiaoDich timKiemGiaoDich(String MaGD) {
        GiaoDich gd = null;

        for (GiaoDich gDich : ds) {
            if (gd.getMaGD().equalsIgnoreCase(MaGD)) {
                GiaoDich = gd;
            } else {

            }
        }
        return gd;
    }

    public GiaoDich Delete(GiaoDich giaoDich) {
        giaoDich.remove();

    }
}
