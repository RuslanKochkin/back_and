package Interface_home1;

public class Plane extends FlyingShipAbstract {
    @Override
    public  void takeOff() {
        setHeight(getHeight()+7500);
    }
}
