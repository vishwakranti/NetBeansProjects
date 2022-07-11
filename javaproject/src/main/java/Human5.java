/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
public class Human5 
{
    int age;
    String name;
    Human5(int a, String n){
        age = a;
        name = n;
    }
    void display(){System.out.println(age+""+name);}
    public static void main(String[] args){
        // Creating objects and passing values
        Human5 h1 = new Human5(20,"Monu");
        Human5 h2 = new Human5(22,"Sonu");
        //calling method to display the values of object
        h1.display();
        h2.display();
        
    }
}
