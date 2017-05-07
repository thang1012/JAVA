/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

/**
 *
 * @author THANG NGUYEN
 */
public class Kethua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n = 5;
        Square vuong = new Square(n);
        System.out.println("Chu vi hv: "+vuong.CV());
        System.out.println("Diện tích hv: "+vuong.DT());
        Round Tron = new Round(2.5);
        System.out.println("Chu vi ht: "+Tron.CV());
        System.out.println("Diện tích ht: "+Tron.DT());
        Shape sp = new Square(n);
        System.out.println("Chhu vi hình vuông :"+sp.CV());
        System.out.println("Diện tích hình vuông: "+sp.DT());
    }
    
}
