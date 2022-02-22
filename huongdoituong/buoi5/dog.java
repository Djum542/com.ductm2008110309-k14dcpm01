package huongdoituong.buoi5;

public class dog {
    // imlemention
    private int size;
    String name;
    String breead;

    public void setSize(int size) {
        // viết code rang buộc
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("no unriend");
        }

    }

    public int getSize() {
        return this.size;
    }
}
