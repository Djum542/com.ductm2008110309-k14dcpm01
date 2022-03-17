package Sourcecodeextends;

public class Chuyenxengoaithanh extends Chuyenxe {

    private String noiDen;
    private int soNgayDiDuoc;
    private String maChuyenxe;
    private String tenTaiXe;
    private String doanhThu;
    private String soXe;

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
        System.out.println("");// ("Doanh thu trong một ngày là:....);
    }

    public Chuyenxengoaithanh(int i, int j, String tenTaiXe, int k, String noiDen,
            int l, double doanhThu) {
        super();
        this.noiDen = noiDen;
        this.soNgayDiDuoc = l;
    }

    public void noiDen() {
        System.out.println("Nơi đến là:");
    }

    public void soNgayDiDuoc() {
        System.out.println("Số ngày đi được");
    }

    @Override
    public String toString() {
        return "Chuyenxengoaithanh []" + "machuyenxe" + this.maChuyenxe + "tentaixe" + this.tenTaiXe + "soxe"
                + this.soXe + "doanhthu" + this.doanhThu;
    }

}
