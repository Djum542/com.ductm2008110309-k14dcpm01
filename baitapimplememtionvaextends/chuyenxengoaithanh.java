public class chuyenxengoaithanh extends Chuyenxe {

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

    protected void soChuyenXe() {
        System.out.println("Số chuyến xe đi trong một ngày:");
    }

    @Override
        protected void doanhThu() {
            System.out.println("Doanh thu trong một ngày là:);
        }

    protected void noiDen() {
        System.out.println("Nơi đến là:");
    }

    protected void soNgayDiDuoc() {
        System.out.println("Số ngày đi được");
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
        System.out.println("Số ngày đi được" + this.soNgayDiDuoc);
        System.out.println("Nơi đến là:" + this.noiDen);
        System.out.println("Doanh thu" + this.doanhThu);

    }

}
