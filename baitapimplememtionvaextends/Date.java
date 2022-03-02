package baitapimplememtionvaextends;
public class Date{
    private Date date;
    /**
     * dd: ngày
     * mm: tháng
     * yyyy: năm
     */
   


//Đổi ngày Java sang kiểu ngày việt dd/mm/yyyy
public Date chuyenNgaySangChuoi(Date date){
     chuoiNgayViet = null;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
    chuoiNgayViet =  simpleDateFormat.format(date);
    return chuoiNgayViet;

}
public void setDate(Date date) {
    this.date = date;
}
public Date getDate() {
    return date;
}
}