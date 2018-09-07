package com.iamtrk.designpatterns.State;

public class InTransit extends State{

    @Override
    void doAction() {
        System.out.println("in InTransit mode");
    }
}
