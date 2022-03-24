/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractfactoryDesignPattern;

/**
 *
 * @author moham
 */
public class BankFactory extends AbstractFactory{  
        public Bank getBank(String bank){  
                if(bank == null){  
                   return null;  
                }  
                if(bank.equalsIgnoreCase("HDFC")){  
                   return new HDFC();  
                } else if(bank.equalsIgnoreCase("ICICI")){  
                   return new ICICI();  
                } else if(bank.equalsIgnoreCase("SBI")){  
                   return new SBI();  
                }  
                return null;  
             }  
            public Loan getLoan(String loan) {  
                return null;  
        }  
    
}
