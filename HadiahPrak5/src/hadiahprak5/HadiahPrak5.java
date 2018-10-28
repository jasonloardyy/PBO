/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahprak5;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class HadiahPrak5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        hargaRumah abc = new hargaRumah();
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
        System.out.println("Harga Rumah = "+abc.getHarga(tipeRumah, blokRumah));
        System.out.print("Bayar = ");
        bayar = input.nextLong();
        info pelanggan = new info(nama,alamat,tipeRumah,blokRumah);
        abc.getHarga(tipeRumah, blokRumah);
        pelanggan.bayarRumah(bayar);
    }
    
}
