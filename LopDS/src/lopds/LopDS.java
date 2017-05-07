/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopds;

/**
 *
 * @author THANG NGUYEN
 */
public class LopDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int[] a = new int[]{1,4,5,6,7,9,2,6};
        DaySo ds = new DaySo(5);
        ds.InDS();
        ds.ThemDau();
        ds.ThemCuoi();
        //ds.SapXep();
    }
    
}
