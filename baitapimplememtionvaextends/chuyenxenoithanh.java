public class chuyenxenoithanh extends Chuyenxe {
    @Override
    protected void maChuyenxe() {
        System.out.println("Mã chuyến xe là:");
    }

    @Override
    protected void tenTaiXe() {
        System.out.println("Tên tài xế là:");
    }

    @Override
    protected void soXe() {
        System.out.println("Số xe trong một ngày:");
    }

    protected void soKMDiDuoc() {
        System.out.println("Số kilomet đi được trong một ngày:");
    }

    @Override
    protected void doanhThu() {
        System.out.println("Doanh thu trong một ngày là:);
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
        System.out.println("Số kilomet đi được" + this.soKMDiDuoc);
        System.out.println("Doanh thu" + this.doanhThu);

    }

}
