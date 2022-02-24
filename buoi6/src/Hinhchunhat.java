import java.util.Set;

public class Hinhchunhat {
    private float chieuDai;
    private float chieuRong;

    public float setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public float setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public double tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public String toString() {
        String string = "chie dai" + this.chieuDai + "chieu rong" + this.chieuRong;
        string += "chu vi" + this.tinhChuVi + "dien tich" + this.tinhDienTich();
        return string;
    }
}
