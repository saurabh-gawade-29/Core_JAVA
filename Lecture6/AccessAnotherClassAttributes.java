package Lecture6;

public class AccessAnotherClassAttributes {
    int x = 5;
}

class second{
    public static void main(String[] args) {
        AccessAnotherClassAttributes myObj = new AccessAnotherClassAttributes();
        System.out.println(myObj.x);
    }
}