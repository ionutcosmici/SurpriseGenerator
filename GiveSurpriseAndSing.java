package Homework.P2_surpriseGenerator;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {

    public GiveSurpriseAndSing(String type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitementâ€¦");
    }

    @Override
    public void give() {
        super.give();
    }

    @Override
    public void giveAll() {
        super.giveAll();
    }
}
