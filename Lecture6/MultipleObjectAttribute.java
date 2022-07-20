package Lecture6;

public class MultipleObjectAttribute {
    int x = 5;

    public static void main(String[] args) {
        MultipleObjectAttribute myObj1 = new MultipleObjectAttribute();  // Object 1
        MultipleObjectAttribute myObj2 = new MultipleObjectAttribute();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25
    }
}
