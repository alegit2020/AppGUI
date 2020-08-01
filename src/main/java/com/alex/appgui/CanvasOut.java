/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.appgui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author alexg
 */
public class CanvasOut extends Canvas {

    @Override
    public void paint(Graphics g) {

        //disegno degli assi cartesiani
        g.setColor(Color.black);
        g.drawLine(CostantiGrafiche.GRAPH_OUT_SYSCO.x, 0,
                CostantiGrafiche.GRAPH_OUT_SYSCO.x, CostantiGrafiche.FinoutDIM.height);

        g.drawLine(0, CostantiGrafiche.GRAPH_OUT_SYSCO.y,
                CostantiGrafiche.FinoutDIM.width, CostantiGrafiche.GRAPH_OUT_SYSCO.y);

    }
}

