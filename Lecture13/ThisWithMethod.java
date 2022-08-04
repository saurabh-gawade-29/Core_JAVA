package Lecture13;
class A{
    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
        //m();//same as this.m()
        this.m();

    }
}

public class ThisWithMethod {
    public static void main(String args[]) {
        A a = new A();
        a.n();
    }
}