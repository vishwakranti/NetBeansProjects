/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
class Aeroplane{
    void fly(){System.out.println("Aeroplane is flying");}
    class Fighterjet extends Aeroplane{
        void fly(){System.out.println("Fighterjet are flying at high speed");}
 }
    
}
public class Jets6 
{
     public static void main(String[] args){
         Jets6 flob = new Jets6();
         flob.fly();
     }
    
}
