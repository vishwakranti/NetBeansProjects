/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
public class Bike6 
{
    String colour;
    String name ;
    
    public void drive(){
        System.out.println("Driving Bike");
        
    } 
    public static void main(String[] args){
        Bike6 b = new Bike6();
        b.colour = "Red";
        b.name = "Pulsar";
        System.out.println(b.colour+" "+b.name);
        b.drive();
    }
}
