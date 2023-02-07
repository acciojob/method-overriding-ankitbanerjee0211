package com.driver;

public class Main {
    class A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    
    class B extends A{
        String meth(){
            return "Invoking method from class B";
        }
    }
    
    public static void main(String[] args){
//         System.out.println(B.meth());
        System.out.println(B.meth());
    }
}
