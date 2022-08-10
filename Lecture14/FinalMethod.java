package Lecture14;

//TODO: If you make any method as final, you cannot override it.
class Bike{
//    TODO: Add Final Keyword to void run method
    void run(){ // Make it Final
        System.out.println("running");
    }
}

public class FinalMethod extends Bike {
    void run(){
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]){
        FinalMethod honda= new FinalMethod();
        honda.run();
    }
}

//Compile time Error
