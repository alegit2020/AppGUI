/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.appgui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author alexg
 * creo la finestra di input con la grafica di base
 */
public class CanvasIn extends Canvas {

    @Override
    public void paint(Graphics g) {
        int dx = CostantiGrafiche.FinoutDIM.width / 6;
        int dy = CostantiGrafiche.FinoutDIM.height / 6;
        g.setColor(Color.gray);
        g.fillOval(0, 0,
                CostantiGrafiche.FinoutDIM.width, CostantiGrafiche.FinoutDIM.height);
        g.setColor(Color.blue);
        g.fillOval(0 + dx, 0 + dy,
                CostantiGrafiche.FinoutDIM.width - 2 * dx, CostantiGrafiche.FinoutDIM.height - 2 * dy);
        g.setColor(Color.red);
        g.fillOval(0 + 2 * dx, 0 + 2 * dy,
                CostantiGrafiche.FinoutDIM.width - 4 * dx, CostantiGrafiche.FinoutDIM.height - 4 * dy);

        g.setColor(Color.black);
        g.drawLine(CostantiGrafiche.GRAPH_IN_SYSCO.x, 0,
                CostantiGrafiche.GRAPH_IN_SYSCO.x, CostantiGrafiche.FinoutDIM.height);

        g.drawLine(0, CostantiGrafiche.GRAPH_IN_SYSCO.y,
                CostantiGrafiche.FinoutDIM.width, CostantiGrafiche.GRAPH_IN_SYSCO.y);

    }
}
 
