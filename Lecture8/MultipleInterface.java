package Lecture8;

interface Printable{
    void print();
}
interface Showable{
    void show();
}
public class MultipleInterface {
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        MultipleInterface obj = new MultipleInterface();
        obj.print();
        obj.show();
    }
}
