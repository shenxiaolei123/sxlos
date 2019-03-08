package com.example.design.simple;

public class SimpleFactory implements ISimpleFactory {
    @Override
    public IComputer create(Class claa) {
        try {
            return (IComputer) claa.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
