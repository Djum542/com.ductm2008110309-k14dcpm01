package Sourcecodeextends;

public class Sachthamkhao extends lirbary {
    protected float thue() {
        System.out.println("gia tri thue");
    }

    public Sachthamkhao(double maSach, String ngayNhap, double donGia, double soLuong, String nhaXuatBan, float thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    @Override
    public String toString() {
        return "Sachthamkhao []" + toString()
                + "thue" + this.thue();
    }

}
