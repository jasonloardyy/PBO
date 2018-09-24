/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konvesiwaktukedetik;
import java.util.Scanner;
/**
 *
 * @author Jason
 */
public class KonvesiWaktuKeDetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jam,menit,detik,totdet;
        Scanner input=new Scanner(System.in);
        System.out.println("Konversi Waktu ke Detik");
        System.out.println("=======================");
        System.out.print("Masukkan Jam = ");
        jam = input.nextInt();
        System.out.print("Masukkan Menit = ");
        menit = input.nextInt();
        System.out.print("Masukkan Detik = ");
        detik = input.nextInt();
        totdet = jam*3600+menit*60+detik;
        System.out.println("\nTotal Detik = "+totdet);
        
    }
    
}
