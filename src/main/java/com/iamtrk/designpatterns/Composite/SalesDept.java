package com.iamtrk.designpatterns.Composite;

public class SalesDept extends Department {
    public SalesDept(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void printDepartmentName() {
        System.out.println(this.name);
    }
}
