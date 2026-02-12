package chapter04;

public class Dog {
    int size;
    String name;

    void bark(){
        if(size > 60){
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }

    void barkAmount(int numOfBarks){
        while (numOfBarks > 0){
            System.out.println("ruff");
            numOfBarks--;
        }
    }
}
