package Lecture14;

class Bike4{
    final void run(){System.out.println("running...");}
}
//  TODO: Yes, final method is inherited but you cannot override it
public class MethodInherited extends Bike4{
    public static void main(String args[]){
        new MethodInherited().run();
    }
}
