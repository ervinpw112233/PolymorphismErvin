/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();
        MatematikaCanggih matematikaCanggih = new MatematikaCanggih();

        // Uji metode di kelas Matematika
        matematika.pertambahan(5, 3);
        matematika.pengurangan(10, 4);
        matematika.perkalian(7, 8);
        matematika.pembagian(20, 4);
        matematika.modulus(17, 5);

        // Uji metode di kelas MatematikaCanggih
        matematikaCanggih.pertambahan(12.5, 28.7, 14.2);
        matematikaCanggih.pengurangan(50.0, 20.0, 10.0);
        matematikaCanggih.perkalian(2.5, 3.0, 4.0);
        matematikaCanggih.pembagian(100.0, 10.0, 2.0);
        matematikaCanggih.modulus(25.0, 7.0, 3.0);
    }
}
