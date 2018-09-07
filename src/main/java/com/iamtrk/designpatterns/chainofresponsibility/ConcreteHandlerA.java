package com.iamtrk.designpatterns.chainofresponsibility;

public class ConcreteHandlerA extends Handler {


    public ConcreteHandlerA(Handler successor) {
        super(successor);
    }

    public void handleRequest(Request request) {

        if (request.getDescription().length()>10) {
            System.out.println(request.getTask());
        } else {
            super.handleRequest(request);
        }

    }
}
