/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author moham
 */
public class AdapterPatternDemo {
    
            public static void main(String args[]){  
                CreditCard targetInterface=new BankCustomer();  
                targetInterface.giveBankDetails();  
                System.out.print(targetInterface.getCreditCard());  
               }   

}
