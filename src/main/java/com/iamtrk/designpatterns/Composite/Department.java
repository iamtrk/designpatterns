package com.iamtrk.designpatterns.Composite;

public abstract class Department {
    String name;
    String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    void printDepartmentName(){};

}
