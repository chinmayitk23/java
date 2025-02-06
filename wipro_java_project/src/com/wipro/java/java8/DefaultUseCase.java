package com.wipro.java.java8;

//First Interface
interface InterfaceA {
 
 
 // Default method
 default void commonMethod() {
     System.out.println("Default method from InterfaceA");
 }
}

//Second Interface
interface InterfaceB {
 

 
 // Default method (same name as in InterfaceA)
 default void commonMethod() {
     System.out.println("Default method from InterfaceB");
 }
}

//Class implementing both interfaces
class DefaultUseCase implements InterfaceA, InterfaceB {

 

 // Resolving conflict for the default method
 @Override
 public void commonMethod() {
     // Choosing to call InterfaceA's commonMethod
     InterfaceA.super.commonMethod();
     InterfaceB.super.commonMethod();
     
 }

 public static void main(String[] args) {
     DefaultUseCase obj = new DefaultUseCase();  
     // Calling the overridden commonMethod
     obj.commonMethod();
 }
}
