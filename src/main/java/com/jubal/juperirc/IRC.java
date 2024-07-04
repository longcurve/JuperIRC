/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jubal.juperirc;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;
import java.io.IOException;

/**
 *
 * @author Bobby Walters
 */


public class IRC extends ListenerAdapter {

    private static final IRC INSTANCE = new IRC();
    private String nick;
    private String ident_nick;
    private String ident_pass;
    private String client;
    private String channel;
    
    private PircBotX pbx;
    
    private IRC() {
    	
    }
    
    private int init(String name, String server, String channel)
    {
        Configuration configuration = new Configuration.Builder()
                .setName("juperircclient") //Set the nick of the bot. CHANGE IN YOUR CODE
                .addServer("irc.libera.net") //Join the freenode network
                .addListener(INSTANCE) //Add our listener that will be called on Events
                .buildConfiguration();

         pbx = new PircBotX(configuration);
    }

    public static IRC getInstance(){
        return INSTANCE;
    }
    
    public static Boolean Connect()
    {
    	// Configure the client
        Configuration configuration = new Configuration.Builder()
                .setName("juperircclient")
                .addServer("chat.libera.net")
                .addListener(new IRC())
                .buildConfiguration();
        
        // Create an instance of PircBotX
        PircBotX bot = new PircBotX(configuration);

        // Connect to the IRC server
        try {
        	bot.startBot();
        	bot.sendIRC().changeNick("juperircclient");
        	bot.sendIRC().joinChannel("##java");
        } catch (IrcException | IOException ex) {
        	
        }
        return true;
    }

}
