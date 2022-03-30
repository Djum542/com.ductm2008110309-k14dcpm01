package tuan5.buoi9;

import java.util.Random;

import javax.swing.tree.RowMapper;

public abstract class Animal {
    // attibute
    private String food;
    private String hungry;

    private String picture;

    // method
    protected abstract void makeNoise();

    protected abstract void eat();

    protected void roam() {
        System.out.println("roam.2q...");
    }

}
