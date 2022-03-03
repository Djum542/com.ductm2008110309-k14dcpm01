import java.util.Scanner;

public class Chuyenxe {
    private double maChuyenxe;
    private String tenTaiXe;
    private double soXe;
    private float doanhThu;

    protected void maChuyenxe() {
        System.out.println("Mã chuyến xe là:");
    }

    protected void tenTaiXe() {
        System.out.println("Tên tài xế là:");
    }

    protected void soXe() {
        System.out.println("Số chuyến xe trong ngày:");
    }

    protected void doanhThu() {
        System.out.println("Doanh thu kiếm được:");
    }

    public void Nhap() {
        System.out.println("Mã số chuyến");
        this.maChuyenxe = input.nextDouble();
        System.out.println("Tên tài xế");
        this.tenTaiXe = input.nextInt();
        System.out.println("Số chuyến");
        this.soXe = input.nextDouble();
        System.out.println("Doamh thu");
        this.doanhThu = input.nextDouble();
    }

    public void xuat() {
        System.out.println("Mã số chuyến" + this.maChuyenxe);
        System.out.println("Tên tài xế" + this.tenTaixe);
        System.out.println("Số xe" + this.soXe);

        System.out.println("Doanh thu" + this.doanhThu);

    }

}
