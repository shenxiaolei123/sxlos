package com.example.design.simple;

public class LenovoAbsFactory implements  IAbsFactory {
    @Override
    public IComputer createComputer() {
        IComputer computer = new LenovoComputer();
        return computer;
    }

    @Override
    public IPhone createPhone() {
        return new LenovoPhone();
    }

    @Override
    public ITv createTv() {
        return new LenovoTv();
    }
}
