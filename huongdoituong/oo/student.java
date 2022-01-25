package huongdoituong.oo;

import java.sql.Date;

public class student {
    String name;
    String age;
    String mssv;
    String lop;

    public void Student(String name, String age, String mssv, String lop) {
        this.name = name;
        this.age = age;
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
