/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderDesignPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moham
 */
public class CDType {
    
             private List<Packing> items=new ArrayList<Packing>();  
             public void addItem(Packing packs) {    
                        items.add(packs);  
                 }  
                 public void getCost(){  
                  for (Packing packs : items) {  
                            packs.price();  
                  }   
                 }  
    public void showItems(){  
     for (Packing packing : items){  
    System.out.print("CD name : "+packing.pack());  
    System.out.println(", Price : "+packing.price());  
        }       
   }
}
