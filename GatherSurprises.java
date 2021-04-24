package Homework.P2_surpriseGenerator;

import java.util.ArrayList;
import java.util.Random;

public class GatherSurprises {

    public static ArrayList<ISurprise> gather(int n) {
        ArrayList<ISurprise> listOfSurprises = new ArrayList<ISurprise>(n);
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int randomNo = random.nextInt(3);
            switch (randomNo) {
                case 0:
                    ISurprise fortuneCookie = FortuneCookie.generate();
                    listOfSurprises.add(fortuneCookie);
                    break;
                case 1:
                    ISurprise candies = Candies.generate();
                    listOfSurprises.add(candies);
                    break;
                case 2:
                    ISurprise minionToy = MinionToy.generate();
                    listOfSurprises.add(minionToy);
                    break;
                default:
                    break;
            }
        }
        return listOfSurprises;
    }

    public static ISurprise gather() {
        Random random = new Random();
        int number = random.nextInt(3);
        switch (number) {
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
            default:
                break;
        }
        return null;
    }
}
