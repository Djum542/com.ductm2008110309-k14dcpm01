package examInterFace;

import java.util.Scanner;

public class HoaDonGio extends HoaDon implements Gio {
    double h, ThanhTien;
    int temp;
    Scanner in = new Scanner(System.in);

    @Override
    public void soGio() {
        // TODO Auto-generated method stub
        System.out.println("Số giờ thuê:");
        h = in.nextDouble();
    }

    @Override
    public void ThanhTien() {
        // TODO Auto-generated method stub
        if (temp <= 24) {

            System.out.println("Thanh tien");
            ThanhTien = this.soGio * this.getDonGia();
        } else {
            if (temp <= 30) {
                System.out.println("Thanh tien");
                ThanhTien = 24 * this.getDonGia();
            } else {
                System.out.println("Không dùng giờ đơn theo giờ");
            }

        }
    }

    public void nhap() {
        super.nhap();
        this.soGio();
        this.ThanhTien = 0;

    }

    @Override
    public String toString() {
        return "HoaDonGio [ThanhTien=" + ThanhTien + ", h=" + h + ", in=" + in + ", temp=" + temp + "]" + toString();
    }

}
