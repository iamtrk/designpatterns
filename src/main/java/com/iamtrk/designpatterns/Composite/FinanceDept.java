package com.iamtrk.designpatterns.Composite;

public class FinanceDept extends Department {
    public FinanceDept(String name, String desc) {
        super(name, desc);
    }

    public void printDepartmentName() {
        System.out.println(this.name);
    }
}
