package com.iamtrk.designpatterns.chainofresponsibility;

/**
 * Base Request which would be passed around.
 * Ex: Logging request.
 * **/
public class Request {

    private String task;
    private String description;

    public Request(String task, String description) {
        this.task = task;
        this.description = description;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
