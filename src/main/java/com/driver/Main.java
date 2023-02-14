package com.driver;

public class Main {
    public static class A{
        public static String meth(){
            return "Invoking method from class A";
        }
    }
    
    public static class B extends A{
        public static String meth(){
            return "Invoking method from class B";
        }
    }
    
    public static void main(String[] args){
//         System.out.println(B.meth());
        System.out.println(B.meth());
    }
}
