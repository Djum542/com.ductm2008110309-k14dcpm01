package tuan4buoi8;

public class ChuyenXe {

    protected double maSoChuyen() {
        System.out.println("Mã số chuyến");
        return 0;
    }

    protected String tenTaiXe() {
        System.out.println("tên tài xe");
        return tenTaiXe();
    }

    protected double soXe() {
        System.out.println("Số xe");
        return 0;
    }

    protected float doanhThu() {
        System.out.println("Doanh thu");
        return 0;
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
