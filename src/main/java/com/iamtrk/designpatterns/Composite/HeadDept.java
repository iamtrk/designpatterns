package com.iamtrk.designpatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDept extends Department {

    List<Department> list;

    public HeadDept(String name, String desc) {
        super(name, desc);
        list = new ArrayList<>();
    }

    public void printDepartmentName() {
        System.out.println(this.name);

        for (Department department : list) {
            department.printDepartmentName();
        }
    }

    public void addDepartment(Department department) {
        list.add(department);
    }
}
