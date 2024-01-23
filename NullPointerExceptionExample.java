/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author NEW EDHOCATION
 */
public class NullPointerExceptionExample {
        public static void main(String[] args) {
        String text = null;

        try {
            int length = text.length();
            System.out.println("Panjang string: " + length);
        } catch (java.lang.NullPointerException e) {
            System.out.println("Kesalahan: String memiliki nilai null.");
        }
    }
}