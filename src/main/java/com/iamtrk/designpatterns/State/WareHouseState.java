package com.iamtrk.designpatterns.State;

public class WareHouseState extends State {
    @Override
    void doAction() {
        System.out.println("In warehouse state");
    }
}
