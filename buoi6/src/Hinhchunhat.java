import java.util.Set;

public class Hinhchunhat {
    private float chieuDai;
    private float chieuRong;

    public float setchieuDai() {
        this.chieuDai = chieuDai;
    }

    public float getchieuDai() {
        return chieuDai;
    }

    public float chieuRong() {
        this.chieuRong = chieuRong;
    }

    public float cjieuRong() {
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
