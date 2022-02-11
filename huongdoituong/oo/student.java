package huongdoituong.oo;

public class student {
    String name;
    int age;
    String mssv;
    String lop;

    public void Student(String name, int age, String mssv, String lop) {
        this.name = name;
        age = age;
        this.mssv = mssv;
        this.lop = lop;
    }

    void hoc() {
        System.out.println("- học");
    }

    void doc() {
        System.out.println("- đọc");
    }

    void thi() {
        System.out.println("- thi");
    }

    void hoatDongNgoaiKhoa() {
        System.out.println("- hoạt động ngoại khoá");
    }

    void in() {
        System.out.println("____________________________________");
        System.out.println("- Thông tin sinh viên: ");
        System.out.println("+ Họ và tên: " + name);
        System.out.println("+ Tuổi: " + age);
        System.out.println("+ MSSV: " + mssv);
        System.out.println("+ Lớp: " + lop);
    }
}
