package Lecture4;
/*
if(condition){
     //code to be executed
          if(condition){
             //code to be executed
    }
}
 */
public class NestedIfStatement {
    public static void main(String[] args) {
        //Creating two variables for age and weight  
        int age=20;
        int weight=80;
        //applying condition on age and weight  
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
        }
    }
}
