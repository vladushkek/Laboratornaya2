package Transport;


public class Airplane extends Transport {


    public Airplane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Movement in the air");

    }
    final static TransportType type = TransportType.AIRPLANE;


    @Override
    protected void print() {
        System.out.println (Airplane.type + ": " + Airplane.name);

    }


}
