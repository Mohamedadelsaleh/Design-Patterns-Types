/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractfactoryDesignPattern;

/**
 *
 * @author moham
 */
public class SBI implements Bank{  
        private final String BNAME;  
            public SBI(){  
                      BNAME="SBI BANK";  
              }  
             public String getBankName(){  
                        return BNAME;  
             }  
}
