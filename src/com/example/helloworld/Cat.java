package com.example.helloworld;

public class Cat extends Animal {
    public void Cry() {
        System.out.println("Mur-mur");
    }

    @Override
    public void SayHello() {
        System.out.println("Cat says HELLO");
    }

    @Override
    public void Eat (){
        System.out.println("Cat says THANK YOU");
    }
}
