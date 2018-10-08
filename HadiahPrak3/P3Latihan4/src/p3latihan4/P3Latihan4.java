/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3latihan4;

/**
 *
 * @author Jason
 */
import java.util.Scanner;
public class P3Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nilai1,nilai2,nilai3,nilai4,nilai5;
        
        System.out.print("Masukkan nilai 1 = ");
        nilai1=input.nextInt();
        int max=nilai1;
        int min=nilai1;
        System.out.print("Masukkan nilai 2 = ");
        nilai2=input.nextInt();
        if(nilai2>max)
            max=nilai2;
        else if(nilai2<min)
            min=nilai2;
        System.out.print("Masukkan nilai 3 = ");
        nilai3=input.nextInt();
        if(nilai3>max)
            max=nilai3;
        else if(nilai3<min)
            min=nilai3;
    
        System.out.print("Masukkan nilai 4 = ");
        nilai4=input.nextInt();
        if(nilai4>max)
            max=nilai4;
        else if(nilai4<min)
            min=nilai4;
        System.out.print("Masukkan nilai 5 = ");
        nilai5=input.nextInt();
        if(nilai5>max)
            max=nilai5;
        else if(nilai5<min)
            min=nilai5;
        
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
    }
    
}
