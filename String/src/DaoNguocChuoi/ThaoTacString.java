/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoNguocChuoi;
import java.util.Scanner;
/**
 *
 * @author THANG NGUYEN
 */
public class ThaoTacString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String str="";
      System.out.print("Nhập vào 1 chuỗi: ");
      str = sc.nextLine();
      String reverse = new StringBuffer(str).reverse().toString();
      System.out.println("\nChuỗi ban đầu: "+str);
      System.out.println("Sau khi đngc:"+reverse);
      System.out.print(reverse.indexOf("ab"));
    }
    
}
