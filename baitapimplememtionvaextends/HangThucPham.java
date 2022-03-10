import baitapimplememtionvaextends.Date;

public class HangThucPham {
    private String id;
    private String tenSP;
    private float donGia;
    private Date NSX;
    private Date HSD;

    private void setId(String id) {

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
            this.donGia = "            ";
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
        if (HSD != null && HSD after (NSX)) {
            this.HSD = HSD;
        }else{
            System.out.println("Hạn sử dung không được để trống");
            this.HSD = "sau ngày sản xuất là 10 ngày";
        }

    }

    public Date getHSD() {
        return HSD;
    }

    public String toString() {
        String string = "Mã" + this.id + "Tên sản phẩm" + this.tenSP + "Đơn giá" + this.donGia + "ngày sản xuất" + NSX
                + "Hạn sử dụng" + HSD;
        return string;
    }

}
