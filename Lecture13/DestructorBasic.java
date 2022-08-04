package Lecture13;

/*
TODO:
    In Java, when we create an object of the class
        it occupies some space in the memory
        If we do not delete these objects,
        it remains in the memory and occupies unnecessary space.

TODO:
     Resolve????? ===> resolve this problem, we use the destructor.
     we will also learn how to use the finalize() method as a destructor.

     =========> there is no concept of destructor in Java. <===========

TODO:
    What is the destructor in Java?
    It is a special method that automatically gets called when an object is no longer used.
    When an object completes its life-cycle the garbage collector deletes that object and
    deallocates or releases the memory occupied by the object.

TODO:
    It is also known as finalizers that are non-deterministic.
    In Java,
        the allocation and deallocation of objects handled by the garbage collector.
        The invocation of finalizers is not guaranteed because it invokes implicitly.

TODO:
    Advantages of Destructor
        * It releases the resources occupied by the object.
        * No explicit call is required, it is automatically invoked at the end of the program execution.
        * It does not accept any parameter and cannot be overloaded.


*/


public class DestructorBasic {
    public static void main(String[] args)
    {
        DestructorBasic de = new DestructorBasic ();
        de.finalize();
        de = null;
        System.gc();
        System.out.println("Inside the main() method");
    }
    protected void finalize()
    {
        System.out.println("Object is destroyed by the Garbage Collector");
    }
}


//Please Check Console on line number 44 then you will get the concept