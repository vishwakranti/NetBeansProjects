/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
public class Division4UserDefined
{
    public static void main(String[] args)
    {
        int num1 = 20;
        int num2 = 2;;
        Division4UserDefined d1 = new Division4UserDefined();
        int num3 = d1.div(num1, num2);
        System.out.println("The division of num1 and num2 is =" + num3);
        
    }
    public int div(int a, int b)
    {
        int c;
        c=a/b;
        return c;
        
    }
    
}
 