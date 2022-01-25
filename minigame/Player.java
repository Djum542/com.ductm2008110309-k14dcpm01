package minigame;

public class Player {
    int number = 0;

    public void guesse() {
        number = (int) (Math.random() * 10);
        System.out.print("I'm guesse" + number);
    }
}
