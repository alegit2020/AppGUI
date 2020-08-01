/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.appgui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author alexg
 */
public class MainMenu extends JFrame{
JFrame fMenu;
JButton bm1,bm2,bm3;

    public MainMenu(){
        JPanel panel = new JPanel();
        fMenu = new JFrame("Menu");
        bm1 = new JButton("Funz Seno");
        bm2 = new JButton("F2");
        bm3 = new JButton("F3");
        panel.setLayout(new GridLayout(3,1));

        panel.add(bm1);
        panel.add(bm2);
        panel.add(bm3);
        
        //mainMenuActionListener al = new mainMenuActionListener();
        bm1ActionListener actionBm1 = new bm1ActionListener();
        bm2ActionListener actionBm2 = new bm2ActionListener();
        bm3ActionListener actionBm3 = new bm3ActionListener();
        bm1.addActionListener(actionBm1);
        bm2.addActionListener(actionBm2);
        bm3.addActionListener(actionBm3);
        fMenu.setLocation(CostantiGrafiche.MENUPOS);
        fMenu.setSize(CostantiGrafiche.MENUDIM);
        fMenu.add(panel);
        
        fMenu.addWindowListener(new mainMenuWindowAdapter());
        fMenu.setVisible(true);
    }

    
/*    public class mainMenuActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(bm1)) {
                //chiamata a Applicativo 1
                new App1();
                System.out.print("\nFunzionalità 1");
            }
            if (e.getSource().equals(bm2)) {
                //chiamata a Applicativo 2
                System.out.print("\nFunzionalità 2");
            }
            if (e.getSource().equals(bm3)) {
                //applicativo 3 o ESCI
                System.out.print("\nFunzionalità 3");
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainMenu container = new MainMenu();
    }
    
}
