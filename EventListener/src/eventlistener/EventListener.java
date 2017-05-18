/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventlistener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author THANG NGUYEN
 */
public class EventListener {

        private JFrame mainframe;
        private JLabel message;
        private JPanel controlpanel;
        private JButton button;
    public EventListener()
    {
        mainframe = new JFrame("Vi du");
        mainframe.setSize(500, 400);
        
        mainframe.setLayout(new BorderLayout());
        message = new JLabel("",JLabel.CENTER);
        message.setSize(200,200);
        //message.setLayout(new FlowLayout(1));
        controlpanel = new JPanel();
        //controlpanel.setLayout(new FlowLayout(1));
        //controlpanel.setLayout(new GridLayout(2,1));
        //controlpanel.add(message);
        mainframe.add(message,BorderLayout.CENTER);
        mainframe.add(controlpanel,BorderLayout.CENTER);
        //mainframe.add(message,BorderLayout.CENTER);
        mainframe.setVisible(true);
    }
    private void testEventListener()
    {
        JButton btnE = new JButton("Click to show event !");
        btnE.addActionListener(new test());
        controlpanel.add(btnE);
        mainframe.setVisible(true);
    }
    public static void main(String[] args) {
        EventListener ev = new EventListener();
        ev.testEventListener();
    }
    class test implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        message.setText("Clicked @@");
        }
    }
    
}
