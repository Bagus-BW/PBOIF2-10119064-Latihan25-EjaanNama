/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan25.ejaannama;

import java.util.Scanner;
/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi memecah nama menjadi sebuah ejaan 
 */
public class PBOIF210119064Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    
    public static void ejaNama(String nama){
        System.out.println("Ejaan untuk " + "'" + nama + "'" + " adalah : ");
        String ejaan[] = nama.split("|");
        for (int i = 0; i < ejaan.length; i++) {
            System.out.println("Huruf ke-" + (i+1) + " : " + ejaan[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = keyboard.next();
        
        System.out.println("");
        ejaNama(nama);
    
    }
    
}
