package Lecture1;

public class VariablesAndDatatype {
    int saurabh = 1;
    int Saurabh = 1;
    int Void = 1; // It's not a good Practice
    int Saurabh1 = 1;
    int _Saurabh$ = 1;
    // int saur abh =1; // White Space Are Not Allowed
    // int 8Saurabh = 1 // Never start with digit
    static int check1 = 11;

    public static void main(String[] args) {
        int saurabh = 1;
        System.out.println("Variables And Data-types");
        System.out.println(saurabh);
        // We cannot Access Class Member without static keyword
        // Eg:
        System.out.println(check1);

    }
}

// TODO: What is Keywords?
// Special Words that reserved eg.

// TODO: What is Variable?
// Variable is a container that store a value
// This value can be changed During Execution

// TODO: Rule of Variables:
// Never Start With DIGIT => eg. 8a
// everytime start with Letter and Case sensitive => int Saurabh = 1, int
// saurabh = 1
// Never used Keywords => int Void = 1
// White Spaces are Not Allowed
// $ and _ <== Allowed AND ==> digit after alphabet eg: int saurabh1 = 1

// Datatype:
// TODO: JAVA is Statically Typed Language => i.e. you need to declare type of
// variable when its init

// TODO: Datatype => 1. Primitive Datatype 2. Non-Primitive DataType
// * Byte:
// value Range from => -128 to 127
// Take 1 Byte = 8 bit
// Default Value is 0
// * Short:
// value range from => [ (2^16)/2 ] to [ (2^16)/2 -1 ]
// Take 2 byte = 16 bit
// Default value is 0
// * int:
// value range from => [ (2^32)/2 ] to [ (2^32)/2 -1 ]
// Take 4 byte = 32 bit
// Default Value is 0
// * Float:
// value range from => [ See Docs ] [ docs.oracle.com ]
// Take 4 byte = 32 bit
// Default Value is 0.0f
// * Long:
// value range from => [ (2^64)/2 ] to [ (2^64)/2 -1 ]
// Take 8 byte = 64 bit
// Default Value is 0
// * Double:
// value range from => [ See Docs ] [ docs.oracle.com ]
// Take 8 byte = 64 bit
// Default Value is 0.0d
// * Char:
// value range from => 0 to 65535( 2^16 -1 )
// Take 2 byte = 16 bit
// Default Value is \u0000
// * Boolean:
// value can be TRUE or FALSE
// Size Depends on JVM
// Default Value is FALSE
