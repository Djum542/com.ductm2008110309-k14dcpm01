package TieuLuanCK;

import java.util.Date;

public class ThucPham extends HangHoa implements HangThucPham {
    public static void main(String[] args) {

    }

    @Override
    public Void NSX() {
        if (this.NSX().before(this.HSD())) {
            this.NSX = new Date();
            System.out.println("Còn hạn sử dụng");
        } else {
            System.out.println("Het");
        }
        return null;
    }

    @Override
    public Void HSD() {
        // TODO Auto-generated method stub
        return null;
    }

}
