/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtoan;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//import javax.swing.*;
/**
 *
 * @author THANG NGUYEN
 */
public class TinhToan extends Frame implements WindowListener,ActionListener{

    private TextField txtA,txtB,txtKQ;
    private Label lblA,lblB,lblKQ;
    private Button btnCong,btnTru,btnNhan,btnChia;
     private int a ;
    private int b ;
    public TinhToan()
    {
        setTitle("Phép Toán");
        setSize(500,120);
        setLayout(new FlowLayout());
        lblA = new Label("A= ");
        add(lblA);
        txtA = new TextField();
        add(txtA);
        
        lblB = new Label("B= ");
        add(lblB);      
        txtB = new TextField();
        add(txtB);
        
       
        btnCong = new Button("Cong");
        btnCong.addActionListener(new tCong());
        btnTru = new Button("Tru");
        //btnCong.addActionListener(this);
        btnTru.addActionListener(new tTru());
        btnNhan = new Button("Nhan");
        //btnCong.addActionListener(this);
        btnNhan.addActionListener(new tNhan());
        btnChia = new Button("Chia");
       // btnCong.addActionListener(this);
       btnChia.addActionListener(new tChia());
        
                add(btnCong);
                add(btnTru);
                add(btnNhan);
                add(btnChia);
               // addWindowListener(this);
               lblKQ = new Label("KẾT QUẢ ");
               add(lblKQ);
        txtKQ = new TextField();
        add(txtKQ);
        setVisible(true);
    }
    public static void main(String[] args) {
        TinhToan tinhToan = new TinhToan();
    }

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       /* int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        if (ae.getSource()== btnCong) {
            txtKQ.setText(Cong(a,b)+"");
        }
        if (ae.getSource()== btnTru) {
            txtKQ.setText(Tru(a,b)+"");
        }
        if (ae.getSource()== btnNhan) {
            txtKQ.setText(Nhan(a,b)+"");
        }
        if (ae.getSource()== btnChia) {
            txtKQ.setText(Chia(a,b)+"");
        }
        */
    }
    int Cong(int a,int b){return a+b;}
    int Tru(int a,int b){return a-b;}
    int Nhan(int a,int b){return a*b;}
    double Chia(int a,int b){return a/b;}
    class tCong implements ActionListener{

       public void actionPerformed(ActionEvent ae) {
          
       a = Integer.parseInt(txtA.getText());
       b = Integer.parseInt(txtB.getText());
            txtKQ.setText(Cong(a,b)+" ");
       }
    }
    class tTru implements ActionListener{

       public void actionPerformed(ActionEvent ae) {
          
       a = Integer.parseInt(txtA.getText());
       b = Integer.parseInt(txtB.getText());
            txtKQ.setText(Tru(a,b)+" ");
       }
    }
    class tNhan implements ActionListener{

       public void actionPerformed(ActionEvent ae) {
          
       a = Integer.parseInt(txtA.getText());
       b = Integer.parseInt(txtB.getText());
            txtKQ.setText(Nhan(a,b)+" ");
       }
    }
    class tChia implements ActionListener{

       public void actionPerformed(ActionEvent ae) {
          
       a = Integer.parseInt(txtA.getText());
       b = Integer.parseInt(txtB.getText());
            txtKQ.setText(Chia(a,b)+" ");
       }
    }
}
