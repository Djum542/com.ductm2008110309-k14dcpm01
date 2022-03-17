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
    private int soKMDiDuoc;

    public void soKMDiDuoc() {
        System.out.println("Số kilomet đi được trong một ngày:");
    }

    @Override
    protected void doanhThu() {
        System.out.println("Doanh thu trong một ngày là:");
    }

    public Chuyenxenoithanh(int i, String tenTaiXe, int j, int k, int l) {
        super(i, tenTaiXe, j, k, l);
        this.soKMDiDuoc = k;
    }

    @Override
    public String toString() {
        return "Chuyenxenoithanh [sourcecodeextends=" + sourcecodeextends + "]";
    }

}
