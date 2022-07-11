/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
class Bird
{
void fly(){
    System.out.println("Birds are flying");
}
}
class parrot extends Bird {
    void screech() {
        System.out.print("Parrots are screeching");
        
    }

}
class peacock extends Bird{
    void scream(){
        System.out.println("Peacock is sreamming");
    }
}
public class ExInheritance {
    public static void main(String[] args){
        peacock p1 = new peacock();
        p1.fly();
        p1.scream();
    }
    
}
