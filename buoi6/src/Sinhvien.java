public class Sinhvien {
    private double MSSV;
    private String HoTen;
    private float DiemLT;
    private float DiemTH;

    public double setMSSV() {
        this.MSSV = MSSV;
    }

    public double getMSSV() {
        return MSSV;
    }

    public String setHoTen() {
        this.HoTen = HoTen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public float setDiemLT() {
        this.DiemLT = DiemLT;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public float setDiemTH() {
        this.DiemTH = DiemTH;
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public float diemTB() {
        return (this.DiemLT * this.DiemTH) / 2;
    }

    public String toString() {
        String string = "Ma so sinh vien" + this.MSSV + "Ho va Ten" + this.HoTen;
        string += "Diem trung binh" + this.diemTB;
        return string;
        public Void nhap(){
            System.out.printf("Nhap MSSV:");
            this.MSSV=input.nextDouble();
            System.out.printf("Nhap Ho Ten:");
            this.HoTen=input.nextLine();

            System.out.printf("Nhap điểm:");
            this.DiemLT=input.nextDouble();
            System.out.printf("Nhap điểm:");
            this.DiemTH=input.nextDouble();
        }
       
    }
}
