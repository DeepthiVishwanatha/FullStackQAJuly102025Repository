package com.sgtesting.programs.ClassDemo;

class Product
{
    String productname;
    int productid;
}
class Customer
{
    String customername;
    int customerid;
}
class Purchase
{
    String purchasename;
    int purchaseid;
}
class Sales
{
    String salesname;
    int salesid;
}

public class Market {
    public static void main(String[] args) {
        Product pro = new Product();
        pro.productname = "T shirt";
        pro.productid = 2;

        System.out.println("product name=" + pro.productname);
        System.out.println("product id=" + pro.productid);

        Customer cus = new Customer();
        cus.customername = "Karthik";
        cus.customerid = 4;

        System.out.println("customer name=" + cus.customername);
        System.out.println("customer id=" + cus.customerid);


        Purchase pus = new Purchase();
        pus.purchasename = "pant";
        pus.purchaseid = 55;

        System.out.println("purchase name=" + pus.purchasename);
        System.out.println("purchase id=" + pus.purchaseid);

        Sales sal = new Sales();
        sal.salesname = "Darshan";
        sal.salesid = 95;

        System.out.println("sales name=" + sal.salesname);
        System.out.println("sales id=" + sal.salesid);

    }
}
