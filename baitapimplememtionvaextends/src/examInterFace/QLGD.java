package src.examInterFace;

import java.util.Scanner;

public class QLGD {
    public static void main(String[] args) {
        ListGD lGd = new ListGD();
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("\n\t\t-------------------");
            System.out.println("\t|0. Thoat ung dung\t\t|");
            System.out.println("\t|1. Them giao dich vang\t\t|");
            System.out.println("\t|2. Them giao dich tien te\t\t|");
            System.out.println("\t|3. Hien thi danhsach giao dich\t\t|");
            System.out.println("\t|4. Xem tong so luong giao dich\t\t|");
            System.out.println("\t|5. Xem trung binh cua giao dich\t\t|");
            System.out.println("\t|6. Hiem thi danh sach giao dich\t\t|");
            x = in.nextInt();
            switch (x) {
                case 1:
                    lGd.ThemGD(1);
                    break;
                case 2:
                    lGd.ThemGD(2);
                    break;
                case 3:
                    lGd.HienDS();
                    break;
                case 4:
                    lGd.TongSL();
                    break;
                case 5:
                    lGd.TBGDTT();
                    break;
                case 6:
                    lGd.GD1ty();
                    break;
                default:
                    break;
            }
        } while (x != 0);
    }
}
