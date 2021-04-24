package Homework.P2_surpriseGenerator;

import java.util.Random;

public class RandomBag extends AbstractBag {

    @Override
    public ISurprise takeOut() {
        if (this.isEmpty()) {
            return null;
        }
        if (this.surprisesBag.size() >= 2) {
            Random random = new Random();
            int randomSurprise = random.nextInt(this.surprisesBag.size());
            return this.surprisesBag.remove(randomSurprise);
        }
        return this.surprisesBag.remove(0);
    }

    @Override
    public void display() {
        for (int i = 0; i < this.surprisesBag.size(); i++) {
            System.out.print("Surprise [" + (i + 1) + "] from Random list: ");
            this.surprisesBag.get(i).enjoy();
        }
    }
}