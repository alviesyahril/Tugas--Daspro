/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prak01;

/**
 *
 * @author USER
 */import java.util.Scanner;
public class Prak01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Masukkan Bulan : ");
        System.out.println();
        int Bulan = masukan.nextInt();
        System.out.println("Musim : ");
        if (Bulan >0 && Bulan <=3)
            System.out.println("Musim Panas");
        else if (Bulan >4 && Bulan <=6)
            System.out.println("Musim Gugur");
        else if (Bulan >7 && Bulan <=9)
            System.out.println("Musim Dingin");
        else if (Bulan >10 && Bulan <=12)
            System.out.println("Musim Semi");
                
    }
    
}
