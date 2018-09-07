package com.iamtrk.designpatterns.chainofresponsibility;

public class TestChainOfResp {

    public static void main(String[] args) {
        Request request = new Request("logging", "BIG");

        Handler handler = new ConcreteHandlerA(null);
        Handler handler1 = new ConcreteHandlerB(handler);

        handler1.handleRequest(request);

    }
}
