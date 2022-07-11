/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
class Multiplier 
{
 static int multiply (int a,int b){return a*b; }
 static float multiply(int a, int b, int c){return a*b*c;}

}
class MultioverloadingExp
{
  public static void main(String[] args){
      System.out.println(Multiplier.multiply (6, 8));
       System.out.println(Multiplier.multiply (5, 5, 5));
  }  
}
