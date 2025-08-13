package com.sgtesting.programs.ClassDemo;

class Flowers1 {
    String flowername;
    String flowercolour;
}
class Fruits
{
    String fruitname;
}
class Vegetables
{
    String vegetablename;
}
public class Flowers {
    public static void main(String[] args) {
        Flowers1 flow = new Flowers1();
        flow.flowername = "sunflower";
        flow.flowercolour = "yellow";

        System.out.println("flowername=" + flow.flowername);
        System.out.println("flowercolour=" + flow.flowercolour);

        Fruits fru = new Fruits();
        fru.fruitname = "orange";

        System.out.println("fruit name=" + fru.fruitname);

        Vegetables veg = new Vegetables();
        veg.vegetablename = "carrot";

        System.out.println("vegetable name=" + veg.vegetablename);

    }
}