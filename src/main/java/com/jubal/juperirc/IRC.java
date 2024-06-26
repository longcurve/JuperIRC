/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jubal.juperirc;

import org.pircbotx.PircBotX;

/**
 *
 * @author Bobby Walters
 */


public class IRC {

    private static final IRC INSTANCE = new IRC();
    private PircBotX pbx = new PircBotX();
    private IRC() {}

    public static IRC getInstance(){
        return INSTANCE;
    }

}
