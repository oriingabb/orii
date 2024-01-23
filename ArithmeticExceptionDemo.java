/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author NEW EDHOCATION
 */
public class ArithmeticExceptionDemo{
    public int division(int a, int b) {
        int result = a / b;
        return result;
    }
    
    public static void main(String[] args) {
        ArithmeticExceptionDemo obj1 = new ArithmeticExceptionDemo();
        
        try {
            obj1.division(5, 0);
            System.out.println("Hasil pembagian Sukses");
        } catch (Exception e) {
            System.out.println("Terjadi Exception");
            System.out.println("Hasil pembagian gagal karena membagi dengan 0");
            System.out.println(e.getMessage());
        }
        
    }
    
}