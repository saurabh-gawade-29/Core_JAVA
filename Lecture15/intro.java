package Lecture15;
/*
TODO: The wrapper class in Java provides the mechanism to :
      convert primitive into object and object into primitive.

Since J2SE 5.0,
autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.
The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.

TODO:
    Use of Wrapper classes in Java
    Java is an object-oriented programming language,
    so we need to deal with objects many times like in Collections, Serialization, Synchronization, etc.
    Let us see the different scenarios, where we need to use the wrapper classes.
    Change the value in Method: Java supports only call by value. So, if we pass a primitive value, it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.
    Serialization: We need to convert the objects into streams to perform the serialization. If we have a primitive value, we can convert it in objects through the wrapper classes.
    Synchronization: Java synchronization works with objects in Multithreading.
    java.util package: The java.util package provides the utility classes to deal with objects.
    Collection Framework: Java collection framework works with objects only. All classes of the collection framework (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.
*/
public class intro {
    public static void main(String[] args) {
        System.out.println("Basics");
    }
}
