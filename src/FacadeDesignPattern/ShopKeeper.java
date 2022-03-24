/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadeDesignPattern;

/**
 *
 * @author moham
 */
public class ShopKeeper {
    
       private MobileShop iphone;  
       private MobileShop samsung;  
       private MobileShop xiaomi;  

       public ShopKeeper(){  
           iphone= new Iphone();  
           samsung=new Samsung();  
           xiaomi=new Xiaomi();  
       }  
       public void iphoneSale(){  
           iphone.modelNo();  
           iphone.price();  
       }  
           public void samsungSale(){  
           samsung.modelNo();  
           samsung.price();  
       }  
      public void blackberrySale(){  
       xiaomi.modelNo();  
       xiaomi.price();  
           }  
}
