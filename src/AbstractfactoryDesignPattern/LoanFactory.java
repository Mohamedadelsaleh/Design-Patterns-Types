/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractfactoryDesignPattern;

/**
 *
 * @author moham
 */
public class LoanFactory extends AbstractFactory{  
            public Bank getBank(String bank){  
                 return null;  
           }  

                public Loan getLoan(String loan){  
                 if(loan == null){  
                    return null;  
                 }  
                 if(loan.equalsIgnoreCase("Home")){  
                    return new HomeLoan();  
                 } else if(loan.equalsIgnoreCase("Business")){  
                    return new BussinessLoan();  
                 } else if(loan.equalsIgnoreCase("Education")){  
                    return new EducationLoan();  
                 }  
                 return null;  
              }  
    
}
