/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3hadiahpesawat;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class P3HadiahPesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nama,alamat;
        char tipePesawat;
        long bayar,kembalian,harga;
        
        System.out.print("Masukkan Nama = ");
        nama=input.next();
        System.out.print("Masukkan Alamat = ");
        alamat=input.next();
        System.out.print("Masukkan Tipe Pesawat = ");
        tipePesawat=Character.toUpperCase(input.next().charAt(0));
        switch(tipePesawat){
            case 'A':harga=5000000;
                     System.out.println("Harga Tipe Pesawat A = Rp. "+harga);
                     break;
            case 'B':harga=2000000;
                     System.out.println("Harga Tipe Pesawat B = Rp. "+harga);
                     break;
            case 'C':harga=1000000;
                     System.out.println("Harga Tipe Pesawat C = Rp. "+harga);
                     break;
            default:System.out.println("\nTipe Pesawat tidak ada!");
                    harga=0;
            System.exit(0);
        }
        System.out.print("Bayar = Rp. ");
        bayar=input.nextLong();
        if (bayar<harga){
            System.out.println("\nPembayaran tidak mencukupi!");
            System.exit(0);
        }
        kembalian=bayar-harga;
        System.out.println("\nNama = "+nama);
        System.out.println("Alamat = "+alamat);
        System.out.println("Kembalian = Rp. "+kembalian);
        
        
        
    }
    
}
