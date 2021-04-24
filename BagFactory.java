package Homework.P2_surpriseGenerator;

public class BagFactory implements IBagFactory {

    @Override
    public IBag makeBag(String type) {
        if (type.equalsIgnoreCase("RANDOM")) {
            return new RandomBag();

        } else if (type.equalsIgnoreCase("FIFO")) {
            return new FIFOBag();

        } else if (type.equalsIgnoreCase("LIFO")) {
            return new LIFOBag();
        }
        return null;
    }
}
