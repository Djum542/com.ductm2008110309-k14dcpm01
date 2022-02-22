package lab4;

public class sanpham {
    String TenSP;
    Double Dongia;
    Double Giamgia;
    Double Thuenhapkhau;

    void Xuat() {
        System.out.println("Tên sản phẩm" + TenSP);
        System.out.println("Đơn giá" + Dongia);
        System.out.println("Giamr giá" + Giamgia);
        System.out.println("Thuê nhập khẩu" + Thuenhapkhau);
    }

    void Thuenhapkau() {
        Thuenhapkhau = Dongia * 0.1;
    }

    void Nhap() {
        String TenSP = new String();
        Dongia = Dongia;
        Giamgia = Giamgia;

    }
}
