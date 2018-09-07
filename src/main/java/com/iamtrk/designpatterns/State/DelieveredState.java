package com.iamtrk.designpatterns.State;

public class DelieveredState extends State {

    @Override
    void doAction() {
        System.out.println("in delivered state");
    }
}
