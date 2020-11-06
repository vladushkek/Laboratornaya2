package Transport;

public class Train extends Transport{

    public Train(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Movement on the rails");

    }

    final static TransportType type = TransportType.TRAIN;


    @Override
    protected void print() {
        System.out.println (Train.type + ": " + Train.name);

    }


}
