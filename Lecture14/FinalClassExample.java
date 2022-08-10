package Lecture14;
// TODO: If you make any class as final, you cannot extend it.
class Bike1{
    //   Make it final class Bike{}
}

public class FinalClassExample extends Bike1 {
    void run(){
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]){
        FinalClassExample honda= new FinalClassExample();
        honda.run();
    }
}
