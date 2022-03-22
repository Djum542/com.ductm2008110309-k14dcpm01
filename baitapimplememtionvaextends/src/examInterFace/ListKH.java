package examInterFace;

import java.rmi.dgc.VMID;

public class ListKH {
    private KhachHang kh[] = new KhachHang[100];
    private int CountKH, sum1 = 0, sum2 = 0, dem = 0, sumtien = 0;

    public ListKH() {
        CountKH = 0;
        for (int i = 0; i < 100; i++)
            kh[i] = new KhachHang() {
            };

    }

    public void ThemKH(int temp) {
        if (CountKH > 100) {
            KhachHangTrong kht = new KhachHangTrong();
            kht.nhap();
            ;
            kht.thanhTien();
            kh[CountKH] = kht;
            sum1 += kht.SoLuong;
        } else {
            kh[CountKH] = new KhachHangNgoai();
            KhachHangNgoai khn = new KhachHangNgoai();
            khn.nhap();
            khn.ThanhTien = 0;
            kh[CountKH] = khn;
            sum2 += khn.SoLuong;
            sumtien += khn.ThanhTien;
            dem++;
        }
        CountKH++;
    }

    public void HienThiKH() {
        for (int i = 0; i < CountKH; i++) {
            System.out.println("\n so TT:" + (i + 1));
            System.out.println(kh[i].toString());
        }
    }

    public void TongSL() {
        System.out.println("Tong so luong dien cua khach hang tronng" + sum1);
        System.out.println("Tong so luong dien cua khach hang ngoai" + sum2);
    }

    public void TrungBinh() {
        System.out.println("Trung binh thanh tien cua khach hang nuoc ngoai" + (sumtien / dem));
    }
}
