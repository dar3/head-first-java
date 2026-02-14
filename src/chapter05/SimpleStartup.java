package chapter05;

public class SimpleStartup {

    int[] locationCells;
    int numOfHits = 0;

    String checkYourself(int guess){

        for (int i: locationCells) {
            if (guess == locationCells[guess]){
                numOfHits++;
            }

        }
    }

    void setLocationCells(int[] loc){

    }

}
