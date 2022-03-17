package Sourcecodeextends;

public class lirbary {
    private String maSach;
    private String nhaXuatBan;
    private String donGia;
    private String soLuong;
    private String tinhTrang;

    public lirbary(double maSach2, String ngayNhap, double donGia2, double soLuong2, String nhaXuatBan2) {
    }

    protected double maSach() {
        System.out.println("ma sach la:....");
        return 0;
    }

    protected String ngayNhap() {
        System.out.println("Ngay nhap la:...");
        return null;
    }

    protected double soLuong() {
        System.out.println("so luong sach:....");
        return 0;
    }

    protected double donGia() {
        System.out.println("don gia:....");
        return 0;
    }

    protected String nhaXuatBan() {
        System.out.println("Nha xuat ban:....");
        return null;
    }

    protected boolean tinhTrang() {
        if (true) {
            System.out.println("sach con moi");

        } else {
            System.out.println("sach da cu");

        }
        return false;
    }

    @Override
    public String toString() {
        return "lirbary []" + "ma sach" + this.maSach + "ngay nhap" + this.ngayNhap() + "don gia" + this.donGia
                + "so luong" + this.soLuong + "nha xuat ban" + this.nhaXuatBan + "tinh trang" + this.tinhTrang;
    }

}
