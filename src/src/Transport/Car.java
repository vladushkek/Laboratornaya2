package Transport;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Car extends Transport{

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Movement on the ground");

    }
    final static TransportType type = TransportType.CAR;


    @Override
    protected void print() {
        System.out.println (Car.type + ": " + Car.name);
    }
}
