package com.example.design.simple;

public class MethodFactoryTest {
    public static void main(String[] args) {
        IMethodFactory factory  = new LenovoFactory();
        IComputer computer = factory.create();
        computer.playgame();
    }
}
