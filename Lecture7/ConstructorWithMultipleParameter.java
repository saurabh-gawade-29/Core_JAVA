package Lecture7;

public class ConstructorWithMultipleParameter {
    int modelYear;
    String modelName;

    public ConstructorWithMultipleParameter(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        ConstructorWithMultipleParameter myCar = new ConstructorWithMultipleParameter(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
