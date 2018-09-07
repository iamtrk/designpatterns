package com.iamtrk.designpatterns.State;

public class DeliveryFailed extends State {
    @Override
    void doAction() {
        System.out.println("in delivery failed state");
    }
}
