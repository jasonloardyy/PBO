/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori3;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class teori3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama;
        float nTugas1,nTugas2,nTugas3,nMid,nFinal,nRata2Tugas,nAkhir;
        char nHuruf='E';
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama = ");
        Nama = input.next();
        System.out.print("Nilai Tugas 1 = ");
        nTugas1 = input.nextFloat();
        System.out.print("Nilai Tugas 2 = ");
        nTugas2 = input.nextFloat();
        System.out.print("Nilai Tugas 3 = ");
        nTugas3 = input.nextFloat();
        System.out.print("Nilai Mid = ");
        nMid = input.nextFloat();
        System.out.print("Nilai Final = ");
        nFinal = input.nextFloat();
        nRata2Tugas = (nTugas1+nTugas2+nTugas3)/3;
        nAkhir = (nRata2Tugas*30/100)+(nMid*30/100)+(nFinal*40/100);
        if (nAkhir>=80 & nAkhir<=100)
                nHuruf='A';
        else if (nAkhir>=60 & nAkhir<=79)
                nHuruf='B';
        else if (nAkhir>=50 & nAkhir<=59)
                nHuruf='C';
        else if (nAkhir>=40 & nAkhir<=49)
                nHuruf='D';
        else if (nAkhir<=40)
                nHuruf='E';
        
        System.out.println("\nNama = "+Nama);
        System.out.println("Nilai Akhir = "+nAkhir);
        System.out.println("Nilai Huruf = "+nHuruf);                
    }
    
}
