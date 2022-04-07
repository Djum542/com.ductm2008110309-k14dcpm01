package TieuLuanCK;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangHoaClient {
    private static final String HangHoa = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List dHangHoa = new ArrayList<HangHoa>();
        while (dHangHoa != null) {
            System.out.println("Nhập vào mã hàng hóa:");
            String maHH = in.nextLine();
            System.out.println("Nhập tên hàng hóa:");
            String tenHH = in.nextLine();
            System.out.println("Nhập số lượng tồn kho:");
            double soLuongTon = in.nextDouble();
            System.out.println("Nhập đơn giá của hàng hóa:");
            double donGia = in.nextDouble();
            System.out.println("Hàng hóa Thucpham_1/DienMay_2/SanhSu_3 >>");
            int loai = in.nextInt();
            HangHoa hangHoa;
            if (loai == 1) {

                System.out.println("Nhập thông tin của hàng thực phẩm cần thêm");
                int nsx = in.nextInt();
                int hsd = in.nextInt();
                hangHoa = new ThucPham(maHH, tenHH, soLuongTon, donGia, nsx, hsd);
            } else if (loai == 2) {
                System.out.println("Nhập thông tin cua hàng điện máy cần thêm");
                hangHoa = new DienMay(maHH, tenHH, soLuongTon, donGia);
            } else {
                System.out.println("Nhập thông tin hàng sanh sứ cần thêm vào");
                hangHoa = new SanhSu(maHH, tenHH, soLuongTon, donGia);

            }
        }
        do {
            System.out.println("----------MENU----------------");
            System.out.println("\n|1.Them hang hoa|");
            System.out.println("\n|2.in ra danh sach hang hoa|");
            System.out.println("\n|3. Xoa hang hoa|");
            System.out.println("\n|4. Tim vi tri hang hoa|");
            System.out.println("\n|5. Sua thong tin hang hoa|");

            System.out.println("\n|0. Ket thuc chuong trinh|");
            int x = in.nextInt();
            switch (x) {
                case 1:

                    dHangHoa.Them(HangHoa);
                    break;
                case 2:
                    dHangHoa.inDanhSach(dHangHoa);
                    break;
                case 3:
                    dHangHoa.xoaGiaoDich(HangHoa);
                    break;
                case 4:
                    dHangHoa.viTri(HangHoa);
                    break;
                case 5:
                    dHangHoa.suaGiaoDich(HangHoa);
                    break;

                default:
                    break;
            }
        } while (dHangHoa != null);
    }
}
