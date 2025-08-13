package com.sgtesting.programs.ClassDemo;

class Person
{
    String firstname;
    int age;

}
public class ObjectDemo {
    public static void main(String[] args) {
        Person obj = new Person();
        System.out.print(obj);

        int sum_even = 0,sum_odd = 0;
        for(int i = 0; i <= 1; i++)
        {
            if( i % 2 == 0 )
            {
                sum_even = sum_even + i;
            }
            else
            {
                sum_odd = sum_odd + i;
            }
        }
        System.out.println( "Sum_of_even_No: "+ sum_even);
        System.out.print( "Sum_of_odd_No: "+ sum_odd);
    }
}
