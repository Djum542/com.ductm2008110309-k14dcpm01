import baitapimplememtionvaextends.Date;

public class HangThucPham {
    private String id;
    private String tenSP;
    private float donGia;
    private Date NSX;
    private Date HSD;

    public void setId(String id) {

        if (id != null) {
            this.id = id;
        }
    }

    public String getId() {
        return id;
    }

    public void setTenSP(String tenSP) {
        if (tenSP != null) {
            this.tenSP = tenSP;
        }

    }

    public String getTenSP() {
        return tenSP;
    }

    public void setDonGia(float donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        }

    }

    public float getDonGia() {
        return donGia;
    }

    public void setNSX(Date nSX) {
        if (NSX != null) {
            NSX = nSX;
        }

    }

    public Date getNSX() {
        return NSX;
    }

    public void setHSD(Date hSD) {
        if (HSD != null) {
            HSD = hSD;
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
