/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfromtinhtoan;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.*;
/**
 *
 * @author THANG NGUYEN
 */
public class JfromTinhtoan extends Frame{

    private Panel panel;
    private Label label;
    public JfromTinhtoan()
    {
        mainFrame();
    }
    private void mainFrame()
    {
        setTitle("Tính Toán");
        setSize(500, 450);
        add(mainJpanel1());
        add(mainJpanel2());
        setVisible(true);
    }
    private Panel mainJpanel1()
    {
        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());
        add(ttLabel());
        add(ttTextfield());
        return panel;
    }
    
    private Panel ttLabel()
    {
        Panel panel = new Panel(new GridLayout(2,1,5,5));
        panel.add(new Label("A ="));
        panel.add(new Label("B= "));
        return panel;
    }
    private Panel ttTextfield()
    {
        Panel panel = new Panel(new GridLayout(2,1,5,5));
        panel.add(new TextField(""));
        panel.add(new TextField(""));
        return panel;
    }
    private Panel mainJpanel2()
    {
        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());
        
        return panel;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
