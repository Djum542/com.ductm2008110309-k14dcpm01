public class Account {
    private long STK;
    private String tenTK;
    private double soTientrongTK;

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
    }

}
