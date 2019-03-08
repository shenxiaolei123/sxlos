package com.example.design.simple;

public class LenovoFactory implements IMethodFactory {

    @Override
    public IComputer create() {
        return new LenovoComputer();
    }
}
