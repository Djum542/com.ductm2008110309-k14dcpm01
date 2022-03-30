package buoi11;

import java.util.Scanner;

public class GiaoDichTestdrive {
    public static void main(String[] args) {
        String count;
        ListGiaoDich lGiaoDich = new ListGiaoDich();
        Scanner in = new Scanner(System.in);
        while (lGiaoDich != null) {

            System.out.println("Nhap vao ma giao dich");
            String MaGD = in.nextLine();
            System.out.println("Nhap ngay giao dich");
            int NgayGD = in.nextInt();
            System.out.println("Nhap don gia");
            double DonGia = in.nextDouble();
            System.out.println("Nhap vao dien tich");
            double DienTich = in.nextDouble();
            System.out.println("Nhap vao loai dat");
            String LoaiDat = in.nextLine();
            System.out.println("Nhap vao loai nha");
            String LoaiNha = in.nextLine();
            System.out.println("Nhap vao dia chi");
            String DiaChi = in.nextLine();
        }
        do {
            System.out.println("----------MENU----------------");
            System.out.println("\n|1.Them giao dich|");
            System.out.println("\n|2.in ra giao dich|");
            System.out.println("\n|3. Tong so giao dich|");
            System.out.println("\n|4. Tinh trung binh tien giao dich dat|");
            System.out.println("\n|0. Ket thuc chuong trinh|");
            String x = in.nextLine();
            switch (x) {
                case 1:

                    break;

                default:
                    break;
            }

        } while (x != 0);

    }
}
