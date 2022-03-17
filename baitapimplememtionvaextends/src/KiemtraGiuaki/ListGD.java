package src.KiemtraGiuaki;

public class ListGD {
    package src.examInterFace;

    public abstract class ListGD {
        DSdaodich gd[] = new DSdaodich[100];
        private int CountGD, sum1 = 0, sum2 = 0, dem = 0, sumtien = 0;
    
        public ListGD() {
            CountGD = 0;
            for (int i = 0; i < 100; i++) {
                gd[i] = new DSdaodich();
            }
        }
    
        public void ThemGD(int temp) {
            if (CountGD > 100) {
                System.out.println("không đủ bo nhớ");
            } else {
                if (temp == 1) {
                    gd[CountGD] = new GDvang();
                    GDvang gdv = new GDvang();
                    gdv.nhap();
                    gdv.ThanhTien = 0;
                    gd[CountGD] = gdv;
                    sum1 += gdv.SoLuong;
                } else {
                    gd[CountGD] = new GDTienTe();
                    GDTienTe gdtt = new GDTienTe();
                    gdtt.nhap();
                    gdtt.ThanhTien = 0;
                    gd[CountGD] = gdtt;
                    sum2 += gdtt.SoLuong;
                    sumtien += gdtt.ThanhTien;
                    dem++;
                }
                CountGD++;
            }
        }
    
        public void HienDS() {
            for (int i = 0; i < CountGD; i++) {
                System.out.println("\n  so tt" + (i + 1));
                System.out.println(gd[i].toString());
            }
        }
    
        // tổng số lương hàng hóa
        public void TongSL() {
            System.out.println("Tổng số lương giao dich vàng" + sum1);
            System.out.println("Tổng số lượng của giao dich tien tệ" + sum2);
        }
    
        public void TBGDTT() {
            System.out.println("Trung bình giao dịch tiền tệ" + (sumtien / dem));
    
        }
    
        public void GD1ty() {
            int d = 0;
            for (int i = 0; i < CountGD; i++) {
                if (gd[i].Dongia > 1000) {
                    System.out.println(gd[i].toString());
                    d++;
                }
    
            }
            if (d == 0) {
                System.out.println("Khong co thong tin");
            }
        }
    }

    public void ThemGD(int i) {
    }

    public void HienDS() {
    }

    public void TongSL() {
    }

    public void TBGDTT() {
    }

    public void GD1ty() {
    }

}
