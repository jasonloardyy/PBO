/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahprak5;

/**
 *
 * @author Jason
 */
public class info extends hargaRumah {
    protected String nama,alamat;
    protected long bayar,kembalian,hargaRumah;
    
    public info(String nama,String alamat,String tipe,char blok){
        this.nama=nama;
        this.alamat=alamat;
        this.hargaRumah=getHarga(tipe,blok);
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
            cetakKembalian(bayar);         
        }
    }
}
