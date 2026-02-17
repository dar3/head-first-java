package chapter05;

public class SimpleStartupGame {

    public static void main(String[] args) {

//        this variable holds number of user guesses
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleStartup theStartup = new SimpleStartup();

//        compute random number between 0 and 4
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theStartup.setLocationCells(locations);

//        tracking if the game is still alive to use it in while loop test

        boolean isAlive = true;
//        repeat while game is still alive
        while (isAlive) {
            int guess = helper.getUserInput("enter a number");

            String result = theStartup.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")){
                isAlive = false;

                System.out.println("You took: " + numOfGuesses + " guesses");
            }
        }

    }
}
