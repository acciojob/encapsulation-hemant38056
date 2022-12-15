package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly rwObject = new RWOnly();
        rwObject.set("Hello");
        System.out.println(rwObject.get());
    }

}