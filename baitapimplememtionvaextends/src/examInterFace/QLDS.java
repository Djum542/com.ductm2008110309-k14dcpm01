package examInterFace;

import java.util.Scanner;

public class QLDS {
    public static void main(String[] args) {
        ListKH lKh = new ListKH();
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("\n\t\t----------------------");
            System.out.println("\n\t\t|0. Thoat ung dung\t\t\t|");
            System.out.println("\n\t\t||1. Them khach hang trong\t\t\t|");
            System.out.println("\n\t\t|2. Them khach hang ngoai\t\t\t|");
            System.out.println("\n\t\t\t|3. Hienthi danh sach khach hang\t\t\t|");
            System.out.println("\n\t\t|4. Tong so dien cua khach hang\t\t\t|");
            System.out.println("\n\t\t\t|4. Xem tb thanh tien cua kh\t\t\t|");
            x = in.nextInt();
            switch (x) {
                case 1:
                    lKh.ThemKH(1);
                    break;
                case 2:
                    lKh.ThemKH(2);
                    break;
                case 3:
                    lKh.HienThiKH();
                    break;
                case 4:
                    lKh.TongSL();
                    break;
                case 5:
                    lKh.TrungBinh();
                    break;
                default:
                    break;
            }

        } while (x != 0);
        System.out.println("");
    }
}
