package Homework.P2_surpriseGenerator;

public class LIFOBag extends AbstractBag {

    @Override
    public ISurprise takeOut() {
        return this.surprisesBag.remove(this.size() - 1);
    }

    @Override
    public void display() {
        for (int i = 0; i < this.surprisesBag.size(); i++) {
            System.out.print("Surprise [" + (i + 1) + "] from LIFO list: ");
            this.surprisesBag.get(i).enjoy();
        }
    }
}
