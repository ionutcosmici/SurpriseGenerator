package Homework.P2_surpriseGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise {

    private static final ArrayList<String> quotes = new ArrayList<String>(
            Arrays.asList("\"The way to get started is to quit talking and begin doing.\" - Walt Disney",
                    "\"Life is what happens when you're busy making other plans.\" - John Lennon",
                    "\"Whoever is happy will make others happy too.\" - Anne Frank",
                    "\"Life is either a daring adventure or nothing at all.\" - Helen Keller",
                    "\"Never let the fear of striking out keep you from playing the game.\" - Babe Ruth",
                    "\"Only a life lived for others is a life worthwhile.\" - Albert Einstein",
                    "\"The purpose of our lives is to be happy.\" - Dalai Lama",
                    "\"May you live all the days of your life.\" - Jonathan Swift",
                    "\"Life is really simple, but we insist on making it complicated.\" - Confucius",
                    "\"Love the life you live. Live the life you love.\" - Bob Marley",
                    "\"Life is ours to be spent, not to be saved.\" - D. H. Lawrence",
                    "\"Life is made of ever so many partings welded together.\" - Charles Dickens",
                    "\"I never dreamed about success, I worked for it.\" - Estee Lauder",
                    "\"It is better to fail in originality than to succeed in imitation.\" - Herman Melville",
                    "\"Nothing is impossible, the word itself says, I'm possible!\" - Audrey Hepburn",
                    "\"You become what you believe.\" - Oprah Winfrey",
                    "\"Everything you've ever wanted is on the other side of fear.\" - George Addair",
                    "\"Dreaming, after all, is a form of planning.\" - Gloria Steinem",
                    "\"I didn't fail the test. I just found 100 ways to do it wrong.\" - Benjamin Franklin",
                    "\"Dream big and dare to fail.\" - Norman Vaughan"));

    private String symbolicMessage;

    public FortuneCookie(String symbolicMessage) {
        this.symbolicMessage = symbolicMessage;
    }

    public String getSymbolicMessage() {
        return symbolicMessage;
    }

    public static FortuneCookie generate() {
        Random random = new Random();
        int randomNo = random.nextInt(quotes.size());
        FortuneCookie fortuneCookie = new FortuneCookie(quotes.get(randomNo));

        return fortuneCookie;
    }

    @Override
    public void enjoy() {
        System.out.println("Fortune Cookie: " + this.symbolicMessage);
    }

    public static void displayQuotes(){
        System.out.print("Quotes: \n");
        for(String quotes : quotes){
            System.out.print(quotes + "\n ");
        }
    }
}
