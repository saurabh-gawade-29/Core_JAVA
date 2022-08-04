package Lecture13;

class Student1{
    int rollno;
    String name;
    float fee;
    Student1(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display1(){System.out.println(rollno+" "+name+" "+fee);}
}

public class ThisSolution {
    public static void main(String args[]) {
        Student1 s1 = new Student1(111, "ankit", 5000f);
        Student1 s2 = new Student1(112, "sumit", 6000f);
        s1.display1();
        s2.display1();
    }
}