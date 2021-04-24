package Homework.P2_surpriseGenerator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*MinionToy.displayMinions();
        Candies.displayCandies();
        FortuneCookie.displayQuotes();

        ArrayList<ISurprise> surprises = GatherSurprises.gather(10);
        System.out.println("\nSize of the bag is: " + surprises.size());
        GiveSurpriseAndHug gSA2 = new GiveSurpriseAndHug("LIFO", 1);
        for (int i = 0; i < surprises.size(); i++) {
            gSA2.put(surprises.get(i));
        }
        gSA2.getBag().display();*/


        System.out.println("\t ~~ Random - Cadourile se vor imparti intr-o ordine aleatoare ~~");
        GiveSurpriseAndApplause gSA = new GiveSurpriseAndApplause("RANDOM", 1);
        gSA.put(GatherSurprises.gather());
        gSA.put(GatherSurprises.gather());
        gSA.put(GatherSurprises.gather());
        gSA.put(GatherSurprises.gather());
        gSA.put(GatherSurprises.gather());

        System.out.println("\nSize of the bag is: " + gSA.getBag().size());
        gSA.getBag().display();
        System.out.println();

        gSA.give();
        System.out.println("\nSize of the bag is: " + gSA.getBag().size());
        System.out.println("Is the bag empty? => " + gSA.isEmpty());
        gSA.getBag().display();
        System.out.println();

        gSA.giveAll();
        System.out.println("\nSize of the bag is: " + gSA.getBag().size());
        System.out.println("Is the bag empty? => " + gSA.isEmpty());
        System.out.println();

        System.out.println("\t ~~ LIFO - Cadourile se vor imparti in ordinea inversa introducerii acestora ~~");
        GiveSurpriseAndHug gSH = new GiveSurpriseAndHug("LIFO", 2);
        for (int i = 0; i < 6; i++) {
            gSH.put(GatherSurprises.gather());
        }

        System.out.println("\nSize of the bag is: " + gSH.getBag().size());
        gSH.getBag().display();
        System.out.println();

        gSH.give();
        System.out.println("\nSize of the bag is: " + gSH.getBag().size());
        System.out.println("Is the bag empty? => " + gSH.isEmpty());
        gSH.getBag().display();
        System.out.println();

        gSH.giveAll();
        System.out.println("\nSize of the bag is: " + gSH.getBag().size());
        System.out.println("Is the bag empty? => " + gSH.isEmpty());
        System.out.println();

        System.out.println("\t ~~ FIFO - Cadourile se vor imparti in ordinea in care acestea au fost introduse ~~");
        GiveSurpriseAndSing gSS = new GiveSurpriseAndSing("FIFO", 3);
        for (int i = 0; i < 8; i++) {
            gSS.put(GatherSurprises.gather());
        }

        System.out.println("\nSize of the bag is: " + gSS.getBag().size());
        gSS.getBag().display();
        System.out.println();

        gSS.give();
        System.out.println("\nSize of the bag is: " + gSS.getBag().size());
        System.out.println("Is the bag empty? => " + gSS.isEmpty());
        gSS.getBag().display();
        System.out.println();

        gSS.giveAll();
        System.out.println("\nSize of the bag is: " + gSS.getBag().size());
        System.out.println("Is the bag empty? => " + gSS.isEmpty());


        System.out.println("\n\t ~~ Random 2 - Cadourile se vor imparti intr-o ordine aleatoare ~~");
        GiveSurpriseAndHug gSAH = new GiveSurpriseAndHug("RANDOM", 0);
        for (int i = 0; i < 10; i++) {
            gSAH.put(GatherSurprises.gather());
        }

        System.out.println("\nSize of the bag is: " + gSAH.getBag().size());
        gSAH.getBag().display();
        System.out.println();

        gSAH.give();
        System.out.println("\nSize of the bag is: " + gSAH.getBag().size());
        System.out.println("Is the bag empty? => " + gSAH.isEmpty());
        gSAH.getBag().display();
        System.out.println();

        gSAH.giveAll();
        System.out.println("\nSize of the bag is: " + gSAH.getBag().size());
        System.out.println("Is the bag empty? => " + gSAH.isEmpty());
        System.out.println();

    }
}
