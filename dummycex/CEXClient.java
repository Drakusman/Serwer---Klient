/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummycex;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gab
 */
public class CEXClient {

    Message m = new Message();
    DummyServer server = new DummyServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CEXClient client = new CEXClient();
        client.execute();
    }
    
    private void execute() {
        System.out.println("[CLIENT] - Starting test...");
        /*
        Connection Test (30)
         */
        System.out.println("[CLIENT] - Checking if server is connected...");
        if (server.isConnected() == true) {
            System.out.println("[CLIENT] - Server is connected, test can proceed");
            /*
            Simple method without exception (40)
             */
            Double x1 = 1.0;
            Double x2 = 1.1;
            if (server.getProductOf(x1, x2) == x1+x2) {
                System.out.println("[CLIENT] - Server returned the correct result");
            }

            /*
            Simple method with exception (49)
             */
            try {
                if (server.GetProductOfWithException(x1, x2) == x1+x2) {
                    System.out.println("[CLIENT] - Server returned the correct result");
                }
                if (server.GetProductOfWithException(null, x2) == x1+x2) {
                    System.out.println("[CLIENT] - Server returned the correct result");
                }
            } catch (Exception ex) {
                Logger.getLogger(CEXClient.class.getName()).log(Level.SEVERE, null, ex);
            }

            /*
            Related Methods without exception
             */
            if(server.addValue(10))
            {
                System.out.println("[CLIENT] - Server gets new value");
            }
            if(server.addValue(5))
            {
                System.out.println("[CLIENT] - Server gets new value");
            }
            if(server.addValue(6))
            {
                System.out.println("[CLIENT] - Server gets new value");
            }
            if(server.addValue(12))
            {
                System.out.println("[CLIENT] - Server gets new value");
            }
            System.out.println("[CLIENT] - the Max value is: " + server.GetMaximumValue());

            /*
            User Defined Types
             */
            Message m1  =   new Message();
            m1.setAuthor("Jasmine");
            m1.setContent("Good morning");
            System.out.println("[CLIENT] - The length of 'Good Morning' is " + server.getMessageAuthorLength(m1));

           Message m2  =   new Message();
            m2.setAuthor("Gab");
            m2.setContent("Hello");
            server.addMessage(m2);

            Message m3  =   new Message();
            m3.setAuthor("Julia");
            m3.setContent("Hello Gab");
            server.addMessage(m3);

            Message m4  =   new Message();
            m4.setAuthor("Gab");
            m4.setContent("How do you do ?"); 
            server.addMessage(m4);

            Message m5  =   new Message();
            m5.setAuthor("Julia");
            m5.setContent("Well, thank you, How do you do ?");
            server.addMessage(m5);
                        
            System.out.println("[CLIENT] - getAllMessagesWithContentContainingString Well are " + server.getAllMessagesWithContentContainingString("Well"));
        } else {
            System.out.println("[CLIENT] - Server is NOT connected, test aborted");
        }
        System.out.println("[CLIENT] - Test completed !");
        
        
    }

    private static Boolean isConnected() {
        dummycex.SimpleWebService_Service service = new dummycex.SimpleWebService_Service();
        dummycex.SimpleWebService port = service.getSimpleWebServicePort();
        return port.isConnected();
    }

    private static Double simpleMethod(java.lang.Double x1, java.lang.Double x2) {
        dummycex.SimpleWebService_Service service = new dummycex.SimpleWebService_Service();
        dummycex.SimpleWebService port = service.getSimpleWebServicePort();
        return port.simpleMethod(x1, x2);
    }

    private static Double getProductOfWithException(java.lang.Double x1, java.lang.Double x2) {
        dummycex.SimpleWebService_Service service = new dummycex.SimpleWebService_Service();
        dummycex.SimpleWebService port = service.getSimpleWebServicePort();
        return port.getProductOfWithException(x1, x2);
    }

    private static Boolean addMessage(dummycex.Message m) {
        dummycex.SimpleWebService_Service service = new dummycex.SimpleWebService_Service();
        dummycex.SimpleWebService port = service.getSimpleWebServicePort();
        return port.addMessage(m);
    }

    private static Integer getMessageAuthorLength(dummycex.Message m) {
        dummycex.SimpleWebService_Service service = new dummycex.SimpleWebService_Service();
        dummycex.SimpleWebService port = service.getSimpleWebServicePort();
        return port.getMessageAuthorLength(m);
    }

    private static Boolean addValue(int v) {
        dummycex.SimpleWebService_Service service = new dummycex.SimpleWebService_Service();
        dummycex.SimpleWebService port = service.getSimpleWebServicePort();
        return port.addValue(v);
    }

    private static Double getMaximumValue() {
        dummycex.SimpleWebService_Service service = new dummycex.SimpleWebService_Service();
        dummycex.SimpleWebService port = service.getSimpleWebServicePort();
        return port.getMaximumValue();
    }
    
}
