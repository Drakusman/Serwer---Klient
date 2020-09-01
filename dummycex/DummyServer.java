/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummycex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gab
 */
public class DummyServer {

    public static void main(String[] args) 
    {
        DummyServer test = new DummyServer();
        test.TEST();
        
    }
   public ArrayList<Integer> values = new ArrayList<>();
   public Message new_Message = new Message();
   public ArrayList<Message> ListofMessages = new ArrayList<Message>();
    /**
     *
     * @return the Integer Value 1.0 if the server is connected
     */
    /**
     * This is a sample web service operation
     */
    
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    
    public Boolean isConnected() {
        System.out.println("[SERVER] - Connection test...");
        return true;
    }

    /**
     * Web service operation
     */
    
    public Double getProductOf(@WebParam(name = "x1") double x1, @WebParam(name = "x2") double x2) {
        return x1+x2;
    }

    /**
     * Web service operation
     * @param x1
     * @param x2
     * @return 
     */
   
    public Double GetProductOfWithException(@WebParam(name = "x1") Double x1, @WebParam(name = "x2") Double x2) {
        try
        {
            
        }
        catch(Exception e)
        {
            if(x1==null)
            {
                throw new NullPointerException("The x1 cannot be null!");
            
            }

            if(x2 == null)
            {
                throw new NullPointerException("The x2 cannot be null!");
            }
        }
           
         
        return x1+x2;
    }

    /**
     * Web service operation
     */
    
    public Boolean addValue(@WebParam(name = "v") int v) {
       
        
        values.add(v);
        return true;
    }

    /**
     * Web service operation
     */
    
    public int GetMaximumValue() {
        //TODO write your implementation code here:
        int max=0;
        for(int i=0;i<values.size();i++)
        {
            if(values.get(i)>max)
            {
                max=values.get(i);
            }
        }
        return max;
    }

    /**
     * Web service operation
     * @param m
     */
    
    public Integer getMessageAuthorLength(@WebParam(name = "m") Message m) {
        new_Message=m;
        String text;
        text=m.content;
        return text.length();
    }

    /**
     * Web service operation
     */
    
    public Boolean addMessage(@WebParam(name = "m") Message m1) {
        ListofMessages.add(m1);
        return true;
    }

    /**
     * Web service operation
     */
    
    public ArrayList<Message> getAllMessagesWithContentContainingString(@WebParam(name = "s") String s) {
        Message new_Message = new Message();
        String text;
        ArrayList<Message> EndList = new ArrayList<Message>();
        
        for(int i=0;i<ListofMessages.size();i++)
        {
            new_Message = ListofMessages.get(i);
            text = new_Message.content.toString();
            if(text.contains(s))
            {
                EndList.add(new_Message);
            }
            
        }
        return EndList;
    }
    public void TEST()
    {
        System.out.println("[SERVER] - Starting test...");
        /*
        Connection Test (30)
         */
        System.out.println("[SERVER] - Checking if server is connected...");
        if (this.isConnected() == true) {
            /*
            Simple method without exception (40)
             */
            Double x1 = 1.0;
            Double x2 = 1.1;
            if (getProductOf(x1, x2) == x1+x2) {
                System.out.println("[SERVER] - Returning the product of "+x1+" and + "+x2);
            }

            /*
            Simple method with exception (49)
             */
            try {
                if (GetProductOfWithException(x1, x2) == x1+x2) {
                    System.out.println("[SERVER] - Returning the product of "+x1+" and + "+x2);
                }
            } catch (Exception ex) {
                Logger.getLogger(CEXClient.class.getName()).log(Level.SEVERE, null, ex);
            }

            /*
            Related Methods without exception
             */
            System.out.println("[SERVER] - Adding 1 to + []");
            if(addValue(1))
            {
                System.out.println("[SERVER] - Now values are + "+this.values+"");
            }
            
            System.out.println("[SERVER] - Adding 2 to + "+this.values+"");
            if(addValue(2))
            {
                System.out.println("[SERVER] - Now values are + "+this.values+"");
            }
            
            System.out.println("[SERVER] - Adding 3 to + "+this.values+"");
            if(addValue(3))
            {
                
                System.out.println("[SERVER] - Now values are + "+this.values+"");
            }
            
            System.out.println("[SERVER] - Adding 4 to + "+this.values+"");
            if(addValue(4))
            {   
                System.out.println("[SERVER] - Now values are + "+this.values+"");
            }
            System.out.println("[SERVER] - Finding minimum among " + values);

            /*
            User Defined Types
             */
            Message m1  =   new Message();
            m1.setAuthor("Jasmine");
            m1.setContent("Good morning");
            addMessage(m1);
            System.out.println("[SERVER] - Adding message: "+m1);
            System.out.println("[SERVER] - Now messages are: "+ListofMessages);
            
            Message m2  =   new Message();
            m2.setAuthor("Gab");
            m2.setContent("Hello");
            addMessage(m2);
            System.out.println("[SERVER] - Adding message: "+m2);
            System.out.println("[SERVER] - Now messages are: "+ListofMessages);
            
            Message m3  =   new Message();
            m3.setAuthor("Julia");
            m3.setContent("Hello Gab");
            addMessage(m3);
            System.out.println("[SERVER] - Adding message: "+m3);
            System.out.println("[SERVER] - Now messages are: "+ListofMessages);
            
            Message m4  =   new Message();
            m4.setAuthor("Gab");
            m4.setContent("How do you do ?"); 
            addMessage(m4);
            System.out.println("[SERVER] - Adding message: "+m4);
            System.out.println("[SERVER] - Now messages are: "+ListofMessages);

            Message m5  =   new Message();
            m5.setAuthor("Julia");
            m5.setContent("Well, thank you, How do you do ?");
            addMessage(m5);
            System.out.println("[SERVER] - Adding message: "+m5);
            System.out.println("[SERVER] - Now messages are: "+ListofMessages);
                        
            System.out.println("[SERVER] - Returning all messages whose containt contains Well " + getAllMessagesWithContentContainingString("Well"));
        } else {
            System.out.println("[SERVER] - Server is NOT connected, test aborted");
        }
        System.out.println("[SERVER] - Test completed !");
        
    }

}
