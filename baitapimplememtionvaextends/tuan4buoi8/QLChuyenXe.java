package tuan4buoi8;

import java.util.Scanner;

public class QLChuyenXe {
    public static void main(String[] args) {
        int x;
        Scanner a = new Scanner(System.in);
        ListChuyenXe dscx = new ListChuyenXe();
        do {
            System.out.println("\n\t----------------------------");
            System.out.println("\t0. exit");
            System.out.println("\t1. Thêm chuyến xe nội thành");
            System.out.println("\t2. Thêm chuyến xe ngoại thành");
            System.out.println("\t3. Hiển thi danh sách");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~");
            x = a.nextInt();
            System.out.println("---------->>");
            switch (x) {
                case 1:
                    dscx.listCX(1);
                    break;
                case 2:
                    dsscx.listcx(2);
                    break;
                case 3:
                    dsscx.listCX(3);
                    break;
                default:
                    break;
            }
        } while (x != 0);
        System.out.println("");
    }
}
