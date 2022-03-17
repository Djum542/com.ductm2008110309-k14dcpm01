
public class AccountTestDriver {
    private static String getSTK;
    private static String getTenTK;
    private static String getSoTientrongTK;

    public static void main(String[] args) {
        Account account = new Account();
        account.setTenTK("152255");
        account.tenTK("TRAN NGUYEN DAT");
        account.soTientrongTK("3300000");
        System.out.println("Số tài khoản" + getSTK);
        System.out.println("Tên tài khoản" + getTenTK);
        System.out.println("Số tiền còn trong tài khoản" + getSoTientrongTK);
        account.napTien();
        account.rutTien();
        account.daoHan();

    }
}
