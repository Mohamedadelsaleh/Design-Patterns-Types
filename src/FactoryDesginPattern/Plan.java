/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryDesginPattern;

/**
 *
 * @author moham
 */
abstract  class Plan {
    
        protected double rate;  
        abstract void getRate();  
   
         public void calculateBill(int units){  
              System.out.println(units*rate);  
            }

}
