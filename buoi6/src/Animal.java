import java.util.Random;

import javax.swing.tree.RowMapper;

public class Animal {
    // attibute
    private String food;
    private String hungry;

    private String picture;

    // method
    protected void makeNoise() {
        System.out.println("make noise ....");
    }

    protected void eat() {
        System.out.println("eat...");
    }

    protected void roam() {
        System.out.println("roam.2q...");
    }

}
