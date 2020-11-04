package Transport;

abstract public class Transport implements ITransport {
    static String name;

    public Transport (String name){
        this.name = name;

    }


    protected abstract void print();

public static void main (String [] args){
    Car car = new Car ("Wally");
    car.print();
    Train train = new Train("Lastochka");
    train.print();
    Airplane airplane = new Airplane("Strela");
    airplane.print();


}


}
