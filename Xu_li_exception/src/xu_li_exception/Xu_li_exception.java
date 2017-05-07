/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xu_li_exception;

/**
 *
 * @author THANG NGUYEN
 */
public class Xu_li_exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try 
        {
        int b = 0;
         int a = 5 / b;
        
        System.out.println("a = " + a);
        } 
        catch (Exception er) 
        {
            System.out.println("Phep chia cho 0: " + er);
        } 
        try
        {
        int arr[] = {1, 2};
        arr[3] = 10;
        }
        catch(Exception e)
        {
            System.out.println("Có lỗi: " + e);
        }
    }
}
