/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thao_tac_mang;

import java.util.Arrays;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author THANG NGUYEN
 */
public class Thao_Tac_Mang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
      Arrays.sort(array);
      printArray("mảng sau khi sắp xếp: ", array);
    }
    private static void printArray(String string,int[] arr)
    {
        System.out.println(string);
        for(int i=0; i< arr.length;i++)
        {
            System.out.print(" "+i);
        }
    
    }
    
}
