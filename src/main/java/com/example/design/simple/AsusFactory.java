package com.example.design.simple;

public class AsusFactory implements IMethodFactory {
    @Override
    public IComputer create() {
        return new AsusComputer();
    }
}
