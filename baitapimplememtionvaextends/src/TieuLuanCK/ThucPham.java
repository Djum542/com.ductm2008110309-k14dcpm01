package TieuLuanCK;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class ThucPham extends HangHoa implements HangThucPham, Serializable {
    Date nsx, hsd;

    @Override
    public Void NSX() {
        if (nsx.before(this.hsd)) {
            this.nsx = nsx;
        } else {
            this.nsx = new Date(0);
        }
        return NSX();
    }

    @Override
    public Void HSD() {
        if (hsd.after(this.nsx)) {
            this.hsd = hsd;
        } else {
            this.hsd = new Date(7);
        }
        return null;
    }

    public ThucPham(String maHH, String tenHH, double soLuongTon, double donGia, Date nsx, Date hsd) {
        super(maHH, tenHH, soLuongTon, donGia);
        this.nsx = nsx;
        this.hsd = hsd;
    }

    @Override
    public String toString() {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat();
        return "ThucPham [hsd=" + ngayVietNam.format(hsd) + ", nsx=" + ngayVietNam.format(nsx) + "]" + super.toString();
    }

}
