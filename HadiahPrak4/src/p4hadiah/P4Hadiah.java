/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4hadiah;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
class Rumah{
    long kembalian,harga=0;
    
    public void infoPembeli(String nama,String alamat){
        System.out.println("\nNama = "+nama);
        System.out.println("Alamat = "+alamat);
    }
    public long hargaRumah(String tipe,char blok){
        if ("36".equals(tipe) && blok=='A')
            harga=500000;
        else if ("36".equals(tipe) && blok=='B')
            harga=300000;
        else if ("37".equals(tipe) && blok=='A')
            harga=800000;
        else if ("37".equals(tipe) && blok=='B')
            harga=600000;
        else{
            System.out.println("Rumah tidak ada!");
            System.exit(0);
        }
        return harga;
    }
    
    public void cetakKembalian(long bayar){
        kembalian=bayar-harga;
        System.out.println("Kembalian = "+kembalian);
    }
    
    public void bayarRumah(long bayar){
        if (bayar<harga){
            System.out.println("Pembayaran kurang!");
            System.exit(0);
        }
        else{
            System.out.println("Bayar = "+bayar);
            cetakKembalian(bayar);         
        }
    }
}
public class P4Hadiah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Rumah abc = new Rumah();
        String tipeRumah,nama,alamat;
        char blokRumah;
        long bayar;
        System.out.print("Masukkan Nama = ");
        nama = input.next();
        System.out.print("Masukkan Alamat = ");
        alamat = input.next();
        System.out.print("Masukkan Tipe Rumah = ");
        tipeRumah = input.next();
        System.out.print("Masukkan Blok Rumah = ");
        blokRumah = Character.toUpperCase(input.next().charAt(0));
        System.out.println("Harga Rumah = "+abc.hargaRumah(tipeRumah, blokRumah));
        System.out.print("Bayar = ");
        bayar = input.nextLong();
        abc.infoPembeli(nama,alamat);
        System.out.println("Harga Rumah = "+abc.hargaRumah(tipeRumah, blokRumah));
        abc.bayarRumah(bayar);
    }
    
}
