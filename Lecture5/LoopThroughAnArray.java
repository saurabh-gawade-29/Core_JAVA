package Lecture5;

public class LoopThroughAnArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
