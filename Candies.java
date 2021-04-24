package Homework.P2_surpriseGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise{

    private static final ArrayList<String> typesOfCandies = new ArrayList<String>(
            Arrays.asList("caramel", "coconut", "cherry", "chocolate", "banana", "coffee", "pineapple", "strawberry", "vanilla", "watermelon", "spearmint", "lime", "grape", "peach"));
    private int noOfCandies;
    private String type;

    public Candies(int noOfCandies, String type) {
        this.noOfCandies = noOfCandies;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static Candies generate(){
        Random random = new Random();
        int typeOfCandy = random.nextInt(typesOfCandies.size());
        int noOfCandies = random.nextInt(100);
        Candies candies = new Candies(noOfCandies, typesOfCandies.get(typeOfCandy));
        return  candies;
    }

    @Override
    public void enjoy() {
        System.out.println("Candies: " + this.noOfCandies +  " " + this.type + " flavored candies");
    }

    public static void displayCandies(){
        System.out.print("Candies flavors: [ ");
        for(String typesOfCandies : typesOfCandies){
            System.out.print(typesOfCandies + " ");
        }
        System.out.print("]\n");
    }
}
