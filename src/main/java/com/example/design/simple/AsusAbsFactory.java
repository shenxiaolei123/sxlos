package com.example.design.simple;

public class AsusAbsFactory implements IAbsFactory {
    @Override
    public IComputer createComputer() {
        return new AsusComputer();
    }

    @Override
    public IPhone createPhone() {
        return new AsusPhone();
    }

    @Override
    public ITv createTv() {
        return new AsusTv();
    }
}
