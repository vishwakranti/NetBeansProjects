/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
public class Employee5 
{
    float salary = 40000;
}

public class Programmer11 extends Employee5{
        int bonus = 10000;
    public static void main(String[] args){
            
        Programmer11 p1 = new Programmer11();
        System.out.println("Employee's salary"+p1.salary);
        System.out.println("Programmer's bonus"+p1.bonus);
}
}
