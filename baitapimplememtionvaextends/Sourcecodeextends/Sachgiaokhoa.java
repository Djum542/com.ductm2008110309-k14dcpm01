package Sourcecodeextends;

public class Sachgiaokhoa extends lirbary {
    public Sachgiaokhoa(double maSach, String ngayNhap, double donGia, double soLuong, String nhaXuatBan,
            boolean tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, tinhTrang);

    }

    @Override
    public String toString() {
        return "Sachgiaokhoa []" + toString();
    }
}
