/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.appgui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author alexg
 */
    public class mainMenuWindowAdapter extends WindowAdapter{
        // l'unico possibile generatore dell'evento è la finestra del Menu
        @Override
        public void windowClosing( WindowEvent e){
            System.exit(0);
        }
    }
