public class Amoeba extends Share {
    private double xPoint;
    private double yPoint;

    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    @Override
    void rotate(){
        System.out.println("Rotating 360 ""xPoint"+xPoint +"yPoint"+yPoint);;

    }

    @Override
    void playSound() {
        System.out.println("Play file.hì" + this.getSoundFile + "múic");
        ;
    }
}
