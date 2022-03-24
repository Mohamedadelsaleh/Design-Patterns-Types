/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderDesignPatterns;

/**
 *
 * @author moham
 */
public class CDBuilder {
    
            public CDType buildSonyCD(){   
                        CDType cds=new CDType();  
                        cds.addItem(new Sony());  
                        return cds;  
                 }  
            public CDType buildSamsungCD(){  
                        CDType cds=new CDType();  
                        cds.addItem(new Samsung());  
                        return cds;  
                         }  
}
