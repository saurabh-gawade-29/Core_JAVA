package Lecture3;

public class StringConcatenation {
    public static void main(String[] args) {
        String a = "Hi";
        String b = "Swapnil";
    //  First Try this:
        System.out.println(a+b);


    //  Then Try This:
    //  We Want Blank Space in two variables:
    //  So we concatenate like ===>  (variable1+" "+ variable2 )
        System.out.println(a +" "+ b);

    // We have method to concatenate: ===> concat()
        System.out.println(a.concat(b));
    // Note: in String Quotation in a black space works / counted as valid string
    // TODO: String a = "Hi " ==> space after Hi
    }
}
