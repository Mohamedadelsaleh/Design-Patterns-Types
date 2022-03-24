/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractfactoryDesignPattern;

/**
 *
 * @author moham
 */
public class FactoryCreator {
 
           public static AbstractFactory getFactory(String choice){  
                 if(choice.equalsIgnoreCase("Bank")){  
                    return new BankFactory();  
                 } else if(choice.equalsIgnoreCase("Loan")){  
                    return new LoanFactory();  
                 }  
                 return null;  
              } 
    
}
