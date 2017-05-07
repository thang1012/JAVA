/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopds;
import java.util.Scanner;
/**
 *
 * @author THANG NGUYEN
 */
public class DaySo {
    private int soluong;
    private final int[] dayso;
    public DaySo(int soluong)           
    {
         this.soluong = soluong;   
         dayso = new int[soluong];
         Nhap();
    }
    public final void Nhap()
    {
        System.out.println("Nhap phan tu:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < soluong; i++) {
            System.out.println("a["+i+"]: ");
            dayso[i] = sc.nextInt();
        }
    }
    public void InDS()
    {      
       for (int i = 0; i < soluong; i++) {         
            System.out.println(dayso[i]);
        }
    }
    public void SapXep()
    {      
       for (int i = 0; i < soluong; i++) {         
            for (int j = 0; j < soluong; j++) {
               int temp;
                if (dayso[i]>dayso[j]) {
                    temp = dayso[i];
                    dayso[i] = dayso[j];
                    dayso[j] = temp;
                }
           }
        }
    }
    public void ThemDau()
    {      
       //them dau
        int newLenght = soluong+1;
        int[] cpDayso = new int [newLenght];
        System.out.print("Nhap so can them: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       
        for (int i = 0; i < cpDayso.length; i++) {
            
            if (i==0) {
                cpDayso[i] = x;
            }
            else
            {
            cpDayso[i] = dayso[i-1];
            }
        }
        for (int i = 0; i < cpDayso.length; i++) {
            System.out.println(cpDayso[i]);
        }
    }
    public void ThemCuoi()
    {      
       //them cuoi
        int newLenght = soluong+1;
         int[] cpDayso = new int [newLenght];
        System.out.print("Nhap so can them: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
       
        for (int i = 0; i < cpDayso.length; i++) {
            if (i==cpDayso.length-1) {
                cpDayso[i] = x;
            }
            else
            {cpDayso[i] = dayso[i];}
            
        }
        for (int i = 0; i < cpDayso.length; i++) {
            System.out.println(cpDayso[i]);
        }
    }
    public void ThemvaoX()
    {
        //them vi tri i
        System.out.print("Nhap so can them: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Nhap vi tri: ");
        int vitri = sc.nextInt();
        for (int i = 0; i < soluong; i++) {
            if(i==vitri)
            {
                dayso[i] = x;
            }
        }
    }
    /**
     * @return the soluong
     */
    public int getSoluong() {
        return soluong;
    }

    /**
     * @param soluong the soluong to set
     */
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
