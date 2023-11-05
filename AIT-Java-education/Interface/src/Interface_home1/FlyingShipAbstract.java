package Interface_home1;

public abstract class FlyingShipAbstract implements FlyingShip{
    private double height;
    private double mileage;
    @Override
    public void land() {
        height = 0;
    }
    @Override
    public  void fly(double distance) {
        double distance1 = 0;
        for (int i = 0; i < 3000; i++) {
            mileage = distance1 + i;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
