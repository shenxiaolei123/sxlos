package com.example.design.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory  factory = new SimpleFactory();
        IComputer computer = factory.create(LenovoComputer.class);
        computer.playgame();
    }
}
