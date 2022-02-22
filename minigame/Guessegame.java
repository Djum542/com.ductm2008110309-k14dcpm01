package k14dcpm01.miniGame;

public class Guessegame {
    // Guessegame có 3 thực thể dành cho 3 ddaaus thủ
    Player P1;
    Player P2;
    Player P3;

    public void Startgame() {
        // Tạo 3 đối tượng gắn cho thực thể
        P1 = new Player();
        P2 = new Player();
        P3 = new Player();
        // Tạo ra 3 giá trị để lưu giá trị của người chơi
        int guesseP1 = 0;
        int guesseP2 = 0;
        int guesseP3 = 0;
        // Khai báo 3 biến để lưu giá trị đúng sai tùy theo đối thủ
        boolean P1isRight = false;
        boolean P2isRight = false;
        boolean P3isRight = false;
        // Sinh một số đẻ 3 đấu thủ đoán
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9 ... ");
        while (true) {
            System.out.println("Number to guesse is" + targetNumber);
            // Yêu cầu 3 đấu thủ đoán
            P1.guesse();
            P2.guesse();
            P3.guesse();
            // Lấy kết quả đoán của từng đấu thủ
            guesseP1 = P1.number;
            System.out.println("Dự đoán của đấu thủ P1" + guesseP1);
            guesseP2 = P2.number;
            System.out.println("Dự đoán của đấu thủ P2" + guesseP2);
            guesseP3 = P3.number;
            System.out.println("Dự đoán của đấu thủ P3" + guesseP3);
            // Kiểm tra xem dự đoán của 3 đấu thủ có đúng không, nếu đúng thì đổi về True

            if (guesseP1 = targetNumber) {
                P1isRight = true;
            }
            if (guesseP2 = targetNumber) {
                
                P2isRight = true;

            }
            if (guesseP3 = targetNumber) {
                
                P3isRight = true;
            }
            // Nếu có ít nhất 1 người đúng
            if (P1isRight || P2isRight || P3isRight) {
                System.out.println("We have a winer");
                System.out.println("Player one got it right" + P1isRight);
                System.out.println("Player two got it right" + P2isRight);
                System.out.println("Player three got it right" + P3isRight);
                System.out.println("Game is over");
                break;
            }
            // Nếu không có người chiến thắng thì lặp lại đoán số
            else {
                System.out.println("Player will have to  try again");
            }
        }

    }
}
