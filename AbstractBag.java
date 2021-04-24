package Homework.P2_surpriseGenerator;

import java.util.ArrayList;

public abstract class AbstractBag implements IBag {

    public ArrayList<ISurprise> surprisesBag = new ArrayList<ISurprise>();

    public ArrayList<ISurprise> getSurprisesBag() {
        return surprisesBag;
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.surprisesBag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprise) {
        if (bagOfSurprise instanceof AbstractBag) {
            AbstractBag newBag = (AbstractBag) bagOfSurprise;
            this.surprisesBag.addAll(newBag.getSurprisesBag());
            newBag.getSurprisesBag().clear();
        }
    }

    @Override
    public boolean isEmpty() {
        return this.surprisesBag.isEmpty();
    }

    @Override
    public int size() {
        return this.surprisesBag.size();
    }

}
