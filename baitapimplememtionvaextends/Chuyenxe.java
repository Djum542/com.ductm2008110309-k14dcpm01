import java.util.Scanner;

public class Chuyenxe {
    protected String Macx, Nametx, Sox;
    protected double Doanhthu;
    Scanner in = new Scanner(System.in);

    protected void setMacx() {
        Macx = Macx;
    }

    protected String getMacx() {
        return Macx;
    }

    protected void setNametx() {
        Nametx = Nametx;
    }

    protected String getNametx() {
        return Nametx;
    }

    protected void setSox() {
        Sox = Sox;
    }

    protected String getSox() {
        return Sox;
    }

    protected void setDoanhthu() {
        Doanhthu = Doanhthu;

    }

    protected double getDoanhthu() {
        return Doanhthu;
    }

    protected Chuyenxe() {
        this.Macx = "";
        this.Nametx = "";
        this.Sox = "";
        this.Doanhthu = 0;
    }

    protected Chuyenxe(String Macx, String Nametx, String Sox, double Doanhthu) {
        this.Macx = "";
        this.Nametx = "";
        this.Sox = "";
        this.Doanhthu = 500;
    }

    protected void nhap() {
        System.out.println("Nhập mã số chyến xe");
        this.Macx = in.nextLine();
        System.out.println("Nhập tên tài xế");
        this.Nametx = in.nextLine();
        System.out.println("Nhập số xe");
        this.Sox = in.nextLine();
        System.out.println("Nhập doanh thu");
        this.Doanhthu = in.nextDouble();

    }

    @Override
    public String toString() {
        return "Chuyenxe [Doanhthu=" + Doanhthu + ", Macx=" + Macx + ", Nametx=" + Nametx + ", Sox=" + Sox + ", in="
                + in + "]";
    }

}