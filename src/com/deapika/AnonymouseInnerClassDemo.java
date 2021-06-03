/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapika;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Opick
 */
public class AnonymouseInnerClassDemo extends Frame {
  String msg = "";
  
  public AnonymouseInnerClassDemo() {
    
    // Anonymouse inner class to handle mouse pressed events.
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent me) {
        msg = "Mouse Pressed.";
        repaint();
      }
    });
    
    // Anonymouse inner class to handle window close events.
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }
  
  public void paint(Graphics g) {
    g.drawString(msg, 20, 80);
  }
  
  public static void main(String[] args) {
    AnonymouseInnerClassDemo appwin = new AnonymouseInnerClassDemo();
    
    appwin.setSize(new Dimension(200, 150));
    appwin.setTitle("AnonymouseInnerClassDemo");
    appwin.setVisible(true);
  }
}
