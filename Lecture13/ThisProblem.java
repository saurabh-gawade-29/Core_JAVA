package Lecture13;
class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
        rollno=rollno;
        name=name;
        fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}
public class ThisProblem {
    public static void main(String args[]) {
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}

// TODO: In the above example, parameters (formal arguments) and instance variables are same.
//  So, we are using this keyword to distinguish local variable and instance variable.