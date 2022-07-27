package Lecture8;

interface printable{
    void print();
}

public class InterfaceExample {
    public void print(){System.out.println("Hello");}

    public static void main(String args[]){
        InterfaceExample obj = new InterfaceExample();
        obj.print();
    }
}
