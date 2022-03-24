/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author moham
 */
public class MessageSubscriberOne implements Observer {

        @Override
        public void update(Message m) {
            System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
        }
    
}
