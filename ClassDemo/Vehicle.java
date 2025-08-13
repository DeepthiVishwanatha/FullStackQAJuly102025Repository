package com.sgtesting.programs.ClassDemo;

class Twowheeler
{
    String vehicalname;
    int insuranceno;
}
class Fourwheeler
{
    String vehicalname;
    int insuranceno;
}
class Heavyvehical
{
    String vehicalname;
    int insuranceno;
}
public class Vehicle {
    public static void main(String[] args)
    {
        Twowheeler honda=new Twowheeler();
        honda.vehicalname="Hero Honda";
        honda.insuranceno=211;

        System.out.println("Two wheelwr ="+honda.vehicalname);
        System.out.println("insurance ="+honda.insuranceno);

        Fourwheeler tata=new Fourwheeler();
        tata.vehicalname="crista";
        tata.insuranceno=233;

        System.out.println("Four wheeler ="+tata.vehicalname);
        System.out.println("insurance ="+tata.insuranceno);

        Heavyvehical benz=new Heavyvehical();
        benz.vehicalname="Ashokalelend";
        benz.insuranceno=442;

        System.out.println("Heavy vechical ="+benz.vehicalname);
        System.out.println("insurance ="+benz.insuranceno);
    }
}
