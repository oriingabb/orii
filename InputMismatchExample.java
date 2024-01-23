/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author NEW EDHOCATION
 */
import java.util.Scanner;

public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");

        try {
            int number = scanner.nextInt();
            System.out.println("Angka yang dimasukkan: " + number);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Kesalahan: Input yang dimasukkan tidak sesuai dengan tipe data int.");
        } finally {
            // Opsional: Blok ini dapat digunakan untuk pembersihan atau tindakan selanjutnya
            scanner.close();
        }
    }
}
