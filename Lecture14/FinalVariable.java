package Lecture14;

/*
TODO: If you make any variable as final, you cannot change the value of final variable(It will be constant).
*/

public class FinalVariable {

    //TODO: Add Final to Variable and see error
    int speedlimit=90; //final variable.

    void run(){
        speedlimit=400;
        System.out.println(speedlimit);
    }

    public static void main(String[] args) {
        FinalVariable obj=new  FinalVariable();
        obj.run();
    }

}

