package TieuLuanCK;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class DienMay extends HangHoa implements HangDienMay {

    @Override
    public void BaoHanh() {

        for (int i = 0; i > 0; i++) {

            if (i > 0) {
                System.out.println("Thoi gian bao hanh la 12 thang");
            } else {
                System.out.println("Khong co bao hanh");
            }
        }
    }

    @Override
    public void CongSuat() {
        for (int i = 1; i > 1; i++) {
            if (i > 0) {
                System.out.println("Thiet bi co cong suat la ");
            }
        }
    }

}
