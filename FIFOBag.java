package Homework.P2_surpriseGenerator;

public class FIFOBag extends AbstractBag {

    @Override
    public ISurprise takeOut() {
        return this.surprisesBag.remove(0);
    }

    @Override
    public void display() {
        for (int i = 0; i < this.surprisesBag.size(); i++) {
            System.out.print("Surprise [" + (i + 1) + "] from FIFO list: ");
            this.surprisesBag.get(i).enjoy();
        }
    }
}
