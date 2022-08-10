package Lecture14;

public class BlankFinalVariable {
        final int speedlimit;//blank final variable
        BlankFinalVariable(){
            speedlimit=70; // init here ===> only in constructor
            System.out.println(speedlimit);
        }

        public static void main(String args[]){
            new BlankFinalVariable();
        }
}

/*
Q) Can we declare a constructor final?
No, because constructor is never inherited.
*/