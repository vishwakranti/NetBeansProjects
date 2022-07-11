/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
public class NestedIfExp {
    public static void main(String[] args){
        String address = "Delhi, India";
        
        if(address.endsWith ("India")){
        if(address.contains("Meerut")){
        System.out.println("city is Meerut");
       }else if(address.contains("Noida")){
        System.out.println("city is Noida");
                
       }else{
        System.out.println(address.split(",") [0]);
       }
       }else{
        System.out.println("You are not living in India");
        }
        }
    
        }
