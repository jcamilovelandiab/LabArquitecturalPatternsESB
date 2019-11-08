/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ESB.app;

/**
 *
 * @author 2131608
 */
public class App {
    public static void main(String[] args) 
    {
        HelloWorldSender sender = new HelloWorldSender();
        sender.run();
        
        HelloWorldConsumer consumer = new HelloWorldConsumer();
        consumer.run();
    }
}
