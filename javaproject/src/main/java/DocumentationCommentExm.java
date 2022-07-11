/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author am
 */
public class DocumentationCommentExm {
    /**
     * This method calculate the summation of the two integers.
     * @param input1 This is the first parameter to sum() method
     * @param input2 This is the second parameter to the sum() method.
     * @return int This returns the addition of input1 and input2
     */
    public int sum(int input1, int input2){
        return input1 + input2;
        
    }
    /**
     * This is the main method uses of sum() method.
     * @param args Unused
     * @see IOException
     */
    public static void main(String[] args){
        DocumentationCommentExm obj = new DocumentationCommentExm();
        int result = obj.sum(40, 20);
        
        System.out.println("Addition of numbers:" + result);
    }
}
