/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.appgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alexg
 */
public class bm1ActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //chiamata a Applicativo 1
        new App1();
        System.out.print("\nFunzionalità 1 _");
    }

}
