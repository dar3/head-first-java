package chapter01;

public class PhraseOMatic {

    public static void main(String[] args) {

        String [] wordListOne = {"24/7", "multi-Tier", "Brave person", "dar3", "30,000 metres", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic" };

        String [] wordListTwo = {"empowered", "superman", "McQueen", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated" };

        String [] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency","strategy", "mindshare", "portal","space", "vision", "paradigm", "mission"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;


        System.out.println("Array 1: " + oneLength);
        System.out.println("Array 2: " + twoLength);
        System.out.println("Array 3: " + threeLength);


        // generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // For the test
        System.out.println("Random 1: " + rand1);
        System.out.println("Random 2: " + rand2);
        System.out.println("Random 3: " + rand3);


        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase

        System.out.println("What we need is a " + phrase);



    }
}
