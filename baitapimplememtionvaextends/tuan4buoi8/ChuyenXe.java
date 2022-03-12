package tuan4buoi8;

public class ChuyenXe {

    protected double maSoChuyen() {
        System.out.println("Mã số chuyến");
    }

    protected String tenTaiXe() {
        System.out.println("tên tài xe");
    }

    protected double soXe() {
        System.out.println("Số xe");
    }

    protected float doanhThu() {
        System.out.println("Doanh thu");
    }

    public ChuyenXe(Double maSoChuyen, String tenTaiXe, double soXe, float doanhThu) {
        this.maSoChuyen();
        this.tenTaiXe();
        this.soXe();
        this.doanhThu();

    }

    @Override
    public String toString() {
        return "ChuyenXe []";
    }
}
