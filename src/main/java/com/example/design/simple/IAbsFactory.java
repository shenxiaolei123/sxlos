package com.example.design.simple;

public interface IAbsFactory {
    IComputer createComputer();
    IPhone createPhone();
    ITv createTv();
}
