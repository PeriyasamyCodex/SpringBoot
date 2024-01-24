package com.spboot.tryouts.inter;

@FunctionalInterface
public interface MyFunctionalInterface {
    
    void method1();

    default void print() {
        System.out.println("I am a default Method");
    }

    default void print2() {
        System.out.println("I am a dafault Method 2");
    }

    static void print3() {
       System.out.println("I am a static method"); 
    }

    static void print4() {
        System.out.println("I am a static method"); 
     }

  
}
