package Lecture3;

public class EscapeSequences {
    public static void main(String[] args) {
    //  First Test This:
//        String txt1 = "saurabh's book";
//        System.out.println(txt1);
    //  Above Statement Work !!!!!!!


    //  But Now, do this
//        String txt2 = "saurabh's book's";
//        System.out.println(txt2);
    // Above Statement Also Work !!!!!


    // Now, Try This !!! ====>>>
//        String txt3 = "saurabh"s Books"s ";
//        System.out.println(txt3);
    // Now you Got Error !!!


    // TODO: How You Solve Above Error: ==> backslash escape character
//        String txt4 = "saurabh\"s book\"s";
//        System.out.println(txt4);
    // Now See !! It's Work

    // TODO: See First Example  ===> we not use escape sequence character
    //  that means ===> we can use single quote in double quote
    //  But we cant use double quote in double Quote
    //  IMP: It's not give any compile time error
    //  but for good practice always use escape sequence

    //  \\ Backslash escape sequence
//        String txt5 = "The character \\ is called backslash.";
//        System.out.println(txt5);

    //  \n New Line escape sequence TODO: Try with Space after \n
//        String txt6 = "Saurabh\nGawade";
//        System.out.println(txt6);


    //  \r Carriage return:
        String txt7 = "Saurabh\rGawade";
        System.out.println(txt7);

    // \t Tab:
        String txt8 = "Saurabh\tGawade";
        System.out.println(txt8);
    // HomeWork:
    // \b: Backspace
    }
}
