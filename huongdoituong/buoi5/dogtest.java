package huongdoituong.buoi5;

public class dogtest {
    public static void main(String[] args) {
        dog Dog = new dog();
        Dog.setSize(5); // = 20;
        System.out.println("kích cỡ" + Dog.getSize());
        Dog.name = "ban";
        System.out.println("tên " + Dog.name);
    }
}
