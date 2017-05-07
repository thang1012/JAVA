/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinglistenerdemo;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;

public class SwingListenerDemo {
   private JFrame mainFrame;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingListenerDemo(){
      mainFrame = new JFrame("Vi du Java Swing");
      mainFrame.setSize(400,200);
      mainFrame.setLayout(new GridLayout(3, 1));
   
      statusLabel = new JLabel("",JLabel.CENTER);        

      statusLabel.setSize(400,150);   
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true); 
   }

   public static void main(String[] args){
      SwingListenerDemo  swingListenerDemo = new SwingListenerDemo();  
      swingListenerDemo.showActionListenerDemo();
   }
   private void showActionListenerDemo(){
         
      JPanel panel1 = new JPanel();         
     JPanel panel2 = new JPanel();
      JButton okButton = new JButton("Click vào đây để tạo sự kiện");
      JButton btnThoat = new JButton("Thoát");
      btnThoat.addActionListener(new BtnEx());
      okButton.addActionListener(new CustomActionListener());        
      panel1.add(okButton);
      panel2.add(btnThoat);
      controlPanel.add(panel1);
      controlPanel.add(panel2);
     mainFrame.setVisible(true); 
      
   }
   
   class CustomActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
          statusLabel.setText("button đã được nhấn.");
      }
   }
   class BtnEx implements ActionListener{
       public void actionPerformed(ActionEvent e)
       {
           mainFrame.dispose();
       }
   }
   
}
