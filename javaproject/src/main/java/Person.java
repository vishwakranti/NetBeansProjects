/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
public class Person {
    public void drink(){
        System.out.println("Drinking Milk");
    }
    public void walk(){
        System.out.println("walking slowly");
    }
    public static void main(String[] args){
        Person Pr1= new Person();
        String name = "Sam";
        Pr1.walk();
        Pr1.drink();
        
    }
    
}
