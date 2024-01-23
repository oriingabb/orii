/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author NEW EDHOCATION
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // InputMismatchException Example
        System.out.print("Masukkan angka: ");
        try {
            int number = scanner.nextInt();
            System.out.println("Angka yang dimasukkan: " + number);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Kesalahan: Input yang dimasukkan tidak sesuai dengan tipe data int.");
        }

        // ArithmeticException Example
        int a = 5;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Hasil pembagian: " + result);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diizinkan.");
        }

        // NullPointerException Example
        String text = null;
        try {
            int length = text.length();
            System.out.println("Panjang string: " + length);
        } catch (java.lang.NullPointerException e) {
            System.out.println("Kesalahan: String memiliki nilai null.");
        }
    }
}   