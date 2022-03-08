package Sourcecodeextends;

public class Chuyenxenoithanh extends Chuyenxe {
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

    Package sourcecodeextends;

    public void soKMDiDuoc() {
        System.out.println("Số kilomet đi được trong một ngày:");
    }

    @Override
    protected void doanhThu() {
        System.out.println("Doanh thu trong một ngày là:");
    }

    public Chuyenxenoithanh(String maChuyenxe, String tenTaiXe, String soXe, String soKMDiDuoc, String doanhThu) {
        super(maChuyenxe, tenTaiXe, soXe, soKMDiDuoc, doanhThu);
        this.soKMDiDuoc = soKMDiDuoc;
    }

    @Override
    public String toString() {
        return "Chuyenxenoithanh [sourcecodeextends=" + sourcecodeextends + "]";
    }

}
