import java.util.Scanner;

public class AccountTestDriver {
    public static void main(String[] args) {
        Account account = new Account();
        account.STK("152255");
        account.tenTK("TRAN NGUYEN DAT");
        account.soTientrongTK("3300000");
        System.out.println("Số tài khoản" + getSTK);
        System.out.println("Tên tài khoản" + getTenTK);
        System.out.println("Số tiền còn trong tài khoản" + getSoTientrongTK);
    }
}
