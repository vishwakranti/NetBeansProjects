/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
class Animal{
    void eat(){
        System.out.println("eating...");
        
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
    
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}
public class TestInheritance {
    public static void main(String[] args){
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
    
}
