package huongdoituong.oo;

public class studentsdriverTest {
    public static void main(String[] args) {
        student taiStudent = new student();
        student thachStudent = new student();
        student trungStudent = new student();

        taiStudent.student("Tai", "19", "2587", "K14DCPM01");
        taiStudent.in();
        taiStudent.hoatDongNgoaiKhoa();

        thachStudent.student("thạch", 19, "288", "K14DCPM02");
        thachStudent.in();
        thachStudent.doc();

        trungStudent.student("Quang Trung", 19, "026", "K14DCPM02");
        trungStudent.in();
        trungStudent.thi();

    }
}
