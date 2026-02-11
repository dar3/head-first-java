package chapter03;

class Dog {
    String name;


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Shelli";


//        Creating new Dog objects in the array
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        int numberOfDogs = myDogs.length;

//        accessing Dogs using array references
        myDogs[0].name = "Nika";
        myDogs[1].name = "Kora";

        System.out.print("Last dog's name is: ");
        System.out.println(myDogs[numberOfDogs-1].name);

        int x = 0;
        while(x < numberOfDogs){
            myDogs[x].bark();
            x++;
        }
    }

    public void bark(){
        System.out.println(name + " says Ruff!");
    }

    public void eat(){

    }

    public void chaseCat(){

    }
}
