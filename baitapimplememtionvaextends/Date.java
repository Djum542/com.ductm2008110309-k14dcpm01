import java.text.SimpleDateFormat;

public class Date {
    private Date date;
    private Object chuoiNgayViet;

    /**
     * dd: ngày
     * mm: tháng
     * yyyy: năm
     */

    // Đổi ngày Java sang kiểu ngày việt dd/mm/yyyy
    public Date chuyenNgaySangChuoi(Date date) {
        chuoiNgayViet = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        chuoiNgayViet = simpleDateFormat.format(date);
        return (Date) chuoiNgayViet;

    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public boolean after(Date nsx) {
        return false;
    }

    public boolean before(Date date2) {
        return false;
    }
}