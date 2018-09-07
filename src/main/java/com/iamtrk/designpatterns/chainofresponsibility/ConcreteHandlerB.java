package com.iamtrk.designpatterns.chainofresponsibility;

public class ConcreteHandlerB extends Handler {
    public ConcreteHandlerB(Handler successor) {
        super(successor);
    }

    public void handleRequest(Request request) {
        if(request.getDescription()!="BIG") {
            System.out.println(request.getDescription());
        } else {
            super.handleRequest(request);
        }
    }
}
