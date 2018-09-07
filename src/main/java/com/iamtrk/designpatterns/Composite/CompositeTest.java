package com.iamtrk.designpatterns.Composite;

public class CompositeTest {

    public static void main(String[] args) {

        Department salesDept = new SalesDept("sales","all stuff related to stuff");
        Department finanDept = new FinanceDept("finance", "all stuff related to fin");
        Department headDept  = new HeadDept("head", "knows about all depts");
        Department primeDept = new HeadDept("prime", "prime of all depts");

        ((HeadDept) headDept).addDepartment(salesDept);
        ((HeadDept) headDept).addDepartment(finanDept);
        ((HeadDept) primeDept).addDepartment(headDept);

        primeDept.printDepartmentName();


    }
}
