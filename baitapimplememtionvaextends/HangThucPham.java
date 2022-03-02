import baitapimplememtionvaextends.Date;

public class HangThucPham {
    private String id;
    private String tenSP;
    private float donGia;
    private Date NSX;
    private Date HSD;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setNSX(Date nSX) {
        NSX = nSX;
    }

    public Date getNSX() {
        return NSX;
    }

    public void setHSD(Date hSD) {
        HSD = hSD;
    }

    public Date getHSD() {
        return HSD;
    }

}
