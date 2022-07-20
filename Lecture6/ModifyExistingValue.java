package Lecture6;

public class ModifyExistingValue {
    int x = 10; // Actually We Override a Value

    public static void main(String[] args) {
        ModifyExistingValue myObj = new ModifyExistingValue();
        myObj.x = 25; // x is now 25
        System.out.println(myObj.x);
    }
}
