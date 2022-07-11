/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author am
 */
import java.util.Scanner;

public class Account {
    //Class Variables
    int balance;
    int previousTransaction;
    
    String customerName;
    String customerID;
    
    //Class Constructor
    Account(String cname, String cid){
        customerName = cname;
        customerID = cid;
        
    }
    
    //Function for Depositing Money
    void deposit(int amount){
        if(amount != 0){
        balance = balance + amount;
        previousTransaction = amount;
    }
    }
    //Function for Withdrawing Money
    void withdraw (int amount){
        if(amount != 0){
        balance = balance  - amount;
        previousTransaction = -amount;
    }
    }
     
    //Function showing the previos transaction
    void getpreviosTransaction(){
        if (previousTransaction > 0){
        System.out.println("Deposited: " + previousTransaction);
    }
    else if(previousTransaction < 0){
    System.out.println("Withdrawn: " + Math.abs(previousTransaction));
    }
    
    else{
        System.out.println("No transaction occured");
            
}
}
  
 //Function calculating intrest of current funds after a number of years
    void calculateIntrest (int years){
        double intrestRate = .0185;
        double newBalance = (balance + intrestRate + years ) + balance;
        System.out.println("The current intrest rate is " + (100 * intrestRate) + "%");
        System.out.println("After " + years + "years , your balance will be:" + newBalance);
 }
  
    //Function showing the main menu
    
    void showMenu(){
        
        char option = '\0';
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "l" );
        System.out.println();
        
        
    
        
        
}
}
