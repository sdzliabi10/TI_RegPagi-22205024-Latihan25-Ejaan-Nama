/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Scanner;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini untuk mengeja nama 
 */
public class TI_RegPagi_22205024_Latihan25_ejaan_nama {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan nama depan anda untuk di eja:");
    String namadepan = scanner.next();
    
    System.out.println("Ejaan nama \"" + namadepan + "\" adalah:");
    for (int i = 0; i < namadepan.length(); i++) {
            char huruf = namadepan.charAt(i);
            System.out.println("Huruf ke-" + (i + 1) + " = " + huruf);
        }
}
}
