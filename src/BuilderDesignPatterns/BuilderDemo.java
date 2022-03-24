/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderDesignPatterns;

/**
 *
 * @author moham
 */
public class BuilderDemo {
    
             public static void main(String args[]){  
            CDBuilder cdBuilder=new CDBuilder();  
            CDType cdType1=cdBuilder.buildSonyCD();  
            cdType1.showItems();  

            CDType cdType2=cdBuilder.buildSamsungCD();  
            cdType2.showItems();  
          }  

}
