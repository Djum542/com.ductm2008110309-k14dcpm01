package tuan4buoi8;

import Sourcecodeextends.Chuyenxe;

public class ListChuyenXe {

    private Chuyenxe[] CX = new Chuyenxe[1000];
    private int CountCX;
    private double sum1 = 0, sum2 = 0;
    private Chuyenxe Ngoaithanh;

    public void ListCX() {
        CountCX = 0;
        for (int i = 0; i < 1000; i++) {
            CX[i] = new Chuyenxe();

        }
    }

    public void listcx(int temp) {
        if (CountCX > 1000) {
            System.out.println("Không thể thêm dữ liệu");

        } else {
            if (temp == 1) {

                NoiThanh noit = new NoiThanh();

                noit.nhap();
                sum1 += noit.doanhThu();
            } else {

                Ngoaithanh ngoait = new Ngoaithanh();
                ngoait.nhap();
                CX[CountCX] = Ngoaithanh;
                sum2 += ngoait.doanhThu();
            }
            CountCX++;
        }
    }

    public void xuat() {
        for (int i = 0; i < CountCX; i++) {
            System.out.println("------------------------------");
            System.out.println(CX[i].toString());
        }
        System.out.println("--------------Doanh Thu-----------");
        System.out.println("|| Chuyến xe noi thành" + sum1 + "||");
        System.out.println("|| Chuến xe ngoại thành" + sum2 + "||");
        System.out.println("-----------------------------------------");
    }
}
