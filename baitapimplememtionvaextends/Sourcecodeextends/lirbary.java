package Sourcecodeextends;

public class lirbary {
    protected double maSach() {
        System.out.println("ma sach la:....");
    }

    protected String ngayNhap() {
        System.out.println("Ngay nhap la:...");
    }

    protected double soLuong() {
        System.out.println("so luong sach:....");
    }

    protected double donGia() {
        System.out.println("don gia:....");
    }

    protected String nhaXuatBan() {
        System.out.println("Nha xuat ban:....");
    }

    protected boolean tinhTrang() {
        if (true) {
            System.out.println("sach con moi");

        } else {
            System.out.println("sach da cu");

        }
    }

    @Override
    public String toString() {
        return "lirbary []" + "ma sach" + this.maSach + "ngay nhap" + this.ngayNhap + "don gia" + this.donGia
                + "so luong" + this.soLuong + "nha xuat ban" + this.nhaXuatBan + "tinh trang" + this.tinhTrang;
    }

}
