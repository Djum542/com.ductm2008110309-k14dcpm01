import javax.naming.MalformedLinkException;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class dog extends Animal {
    @Override
    protected void makeNoise() {
        System.out.println("Making noise Gâu Gâu");
    }

    @Override
    protected void eat() {
        System.out.println("dog.eat()");

    }

}
