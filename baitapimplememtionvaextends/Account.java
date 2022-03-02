package baitapimplememtionvaextends;

import java.text.DecimalFormat;
import java.util.Formatter;

public class Account {
    // implemention
    private long STK;
    private String tenTK;
    private double soTientrongTK;
    private float hangsolai;

    public void setSTK(long sTK) {
        STK = sTK;
    }

    public long getSTK() {
        return STK;
    }

    public void setSoTientrongTK(double soTientrongTK) {
        this.soTientrongTK = soTientrongTK;
    }

    public double getSoTientrongTK() {
        return soTientrongTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getTenTK() {
        return tenTK;
        DecimalFormat donvitien = new DecimalFormat();
        System.out.println(Formatter.format() + "vnđ");
    }

    // Hằng số lãi xuất
    public void setHangsolai(float hangsolai) {
        this.hangsolai = hangsolai;

    }

    public float getHangsolai() {
        return hangsolai;
        hangsolai = soTientrongTK * 0.035;
    }

    public boolean Account() {
        if (true) {
            this.STK = STK;
            this.tenTK = tenTK;
            this.soTientrongTK = soTientrongTK;
            soTientrongTK = 50;
        } else {
            Account account = new Account();
        }

    }

    public void napTien() {
        napTien = soTientrongTK + soTienNapVao;

    }

    public void rutTien() {
        if (rutTien < soTientrongTK) {
            rutTien = soTientrongTK - (soTienRut + phiRutTien);
        }
    }

    public void daoHan() {
        daoHan = soTientrongTK + (soTientrongTK * hangSoLai);
    }

}
