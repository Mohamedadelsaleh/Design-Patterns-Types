/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependencyinversion;

/**
 *
 * @author moham
 */
public class MyApplication {
    
            private EmailService email = new EmailService();

            public void processMessages(String msg, String rec){               
                    this.email.sendEmail(msg, rec);
            }
}
