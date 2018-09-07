package com.iamtrk.designpatterns.chainofresponsibility;

/*Handle abstract class.
* Concrete handlers implement this handler abstract class.
* */
public abstract class Handler {

    private Handler successor;
    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(Request request) {
        if (successor!=null) {
            successor.handleRequest(request);
        }
    }
}
