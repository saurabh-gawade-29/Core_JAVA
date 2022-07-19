package Lecture5;
/*
* SYNTAX:
for (type variableName : arrayName) {
  // code block to be executed
}
*
* */
public class ForEachLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // same datatype for declare array and init variable
        for(String i: cars){
            System.out.println(i);
        }
    }
}
