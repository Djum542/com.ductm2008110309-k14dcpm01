import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class HangThucPham {
    private String id;
    private String tenSP;
    private float donGia;
    private Date NSX;
    private Date HSD;

    void setId(String id) {

        if (id != null) {
            this.id = id;
        } else {
            System.out.println(" Không được để chống");
            this.id = "tp";
        }
    }

    public String getId() {
        return id;
    }

    public void setTenSP(String tenSP) {
        if (tenSP != null) {
            this.tenSP = tenSP;
        } else {
            System.out.println("Tên hàng không được rỗng");
            this.tenSP = "xxxxxxx";

        }

    }

    public String getTenSP() {
        return tenSP;
    }

    public void setDonGia(float donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        } else {
            System.out.println("Đơn giá");
            this.donGia = 000000000;
        }

    }

    public float getDonGia() {
        return donGia;
    }

    public void setNSX(Date nSX) {
        if (NSX != null) {
            this.NSX = NSX;
        } else {
            System.out.println("Ngày sản xuất không để trống");
            this.NSX = new Date();// ngày sản xuất
        }

    }

    public Date getNSX() {
        return NSX;
    }

    public void setHSD(Date hSD) {
        if (HSD != null) {

            if (HSD.after(this.NSX)) {
                this.HSD = HSD;
            }

        } else {
            System.out.println("Hạn sử dung không được để trống");
            this.HSD = new Date();
        }

    }

    public Date getHSD() {
        return HSD;
    }

    @Override
    public String toString() {
        // dd/mm/yyy 10/3/2022
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/mm/yyyy");

        Locale localeVN = new Locale("vi", "vn");
        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(localeVN);
        return "HangThucPham [HSD=" + ngayVietNam.format(HSD) + ", NSX=" + ngayVietNam.format(NSX) + ", donGia="
                + tienVietNam.format(donGia) + ", id=" + id + ", tenSP=" + tenSP
                + "]";
    }

    public HangThucPham(String id, String tenSP, float donGia, Date nSX, Date hSD) {
        this.id = id;
        this.tenSP = tenSP;
        this.donGia = donGia;
        NSX = nSX;
        HSD = hSD;
    }

    public boolean kiemTraNgayHetHan(Date HSD, Date NSX) {
        boolean isHSD = false;
        if (this.HSD.before(new Date())) {
            isHSD = true;
            System.out.println("Sản phẩm đã hết hạn");
        } else {
            System.out.println("Sản phẩm còn hạn");
        }
        return isHSD;

    }
}
