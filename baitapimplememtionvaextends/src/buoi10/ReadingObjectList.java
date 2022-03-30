package buoi10;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.ObjectInputStream;

public class ReadingObjectList {
    public static void main(String[] args) throws IOError, ClassNotFoundException {

        FileInputStream InFile = new FileInputStream(data.dat);
        ObjectInputStream objIn = new ObjectInputStream(data.dat);
    }
}
