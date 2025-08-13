package com.sgtesting.programs.ClassDemo;

class Departement {
    int departementtid;
    String departementname;
}

class Insurance {
    String insurancename;
    int insuranceamount;
}
class Employee1
{
    String firstname;
    int salary;
}
public class Employee {



    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.firstname = "Karthik";
        emp.salary = 2000;

        System.out.println("firstname: " + emp.firstname);
        System.out.println("salary: " + emp.salary);

        Departement dept = new Departement();
        dept.departementtid = 2;
        dept.departementname = "MCA";

        System.out.println("departementid: " + dept.departementtid);
        System.out.println("departementname: " + dept.departementname);

        Insurance insu = new Insurance();
        insu.insurancename = "life";
        insu.insuranceamount = 4000;

        System.out.println("insurancename: " + insu.insurancename);
        System.out.println("insuranceamount: " + insu.insuranceamount);
    }
}