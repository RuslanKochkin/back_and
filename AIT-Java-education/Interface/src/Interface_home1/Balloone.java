package Interface_home1;

public class Balloone extends FlyingShipAbstract {
    @Override
    public  void takeOff() {
        setHeight(getHeight()+1500);
    }
}
