/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummycex;

import java.util.Date;

/**
 *
 * @author Gab
 */
public class Message 
{
    /**
     * The author of the message
     */
    String  author  =   null;
    /**
     * The content of the message
     */
    String  content =   null;
    /**
     * The date when the message was created
     */
    Date    date    =   new Date();

    
    /**
     * 
     * @return the author of the content
     */
    public String getAuthor() {
        return this.author;
    }
    
    /**
     * 
     * @param a the Author of the message.
     * @return true (The value has no semantic value, it is used only to avoid returning nulls). If the parameter is either null or empty, its value will be set to "Anonymous"
     */
    public Boolean setAuthor(String a) {
        if((author == null) || (author.isEmpty()))
            this.author =   a;
        return null;
    }
    
    /**
     * 
     * @return the content of the Message
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 
     * @param c, the content of the message.
     * @return true (The value has no semantic value, it is used only to avoid returning nulls)
      */
    public Boolean setContent(String c) {
        if((content == null) || (content.isEmpty()))
            this.content =   c;
        return null;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
       
    @Override
    public String toString() {
        return "Message{" + "author=" + author + ", content=" + content + ", date=" + date + '}';
    }
}
