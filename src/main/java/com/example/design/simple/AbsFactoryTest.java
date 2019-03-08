package com.example.design.simple;

public class AbsFactoryTest {
    public static void main(String[] args) {
        LenovoAbsFactory factory = new LenovoAbsFactory();
        factory.createComputer().playgame();
        factory.createPhone().callgive();
        factory.createTv().tvplay();

        AsusAbsFactory asusAbsFactory = new AsusAbsFactory();
        asusAbsFactory.createComputer().playgame();
    }
}
