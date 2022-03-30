package buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import KiemtraGiuaki.Dat;

public class WritingObject {

    private static final String lít = null;

    public static void main(String[] args, Object htp1, Object htp2) throws IOException {
        ObjectOutputStream outFile = new ObjectOutputStream(outFile);
        List<HangThucPham> htp = new ArrayList<>();
        List.add(htp1);
        List.add(htp2);
        ObjectOutput.WritingObject(lít);
        System.out.println(htp);
        ObjectOutput.close("Exit");
    }
}
