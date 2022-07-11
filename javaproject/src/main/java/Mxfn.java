/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
public class Mxfn 
{
    public static void main(String[] args)
    {
        int num1 = 20;
        int num2 = 2;
     
        int num3 = Mxfn(num1, num2);
        System.out.println("The maximum of " + num1 + " and " + num2 + " is = " + num3);   
    }
    public static int Mxfn(int num1, int num2)
    {
        int c;
        if(num1>num2)
        {
            System.out.println("num1 is greater");
            c = num1;
            
        }
        else{
            System.out.println("num2 is greater");
            
            c = num2;
            
        }
        return c;
    }
    
}
 