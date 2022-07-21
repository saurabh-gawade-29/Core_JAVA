package Lecture7;

public class ConstructorParameter {
    int x;

    public ConstructorParameter(int y) {
        x = y;
//        System.out.println(y);
    }

    public static void main(String[] args) {
        ConstructorParameter myObj = new ConstructorParameter(5);
        System.out.println(myObj.x);
    }
}
