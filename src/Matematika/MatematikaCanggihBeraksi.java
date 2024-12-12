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
        MatematikaCanggih matematikaCanggih = new MatematikaCanggih();

        // Pengujian metode dengan parameter pecahan
        System.out.println("Uji Metode dengan Pecahan:");
        double hasilPertambahan = matematikaCanggih.pertambahan(12.5, 28.7, 14.2);
        System.out.println("Pertambahan (12.5, 28.7, 14.2): " + hasilPertambahan);

        // Pengujian overloading
        System.out.println("\nUji Overloading Pertambahan:");
        System.out.println("Pertambahan (12.5, 28.7, 14.2): " + matematikaCanggih.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (12, 28, 14): " + matematikaCanggih.pertambahan(12, 28, 14));
        System.out.println("Pertambahan (23, 34): " + matematikaCanggih.pertambahan(23, 34));
        System.out.println("Pertambahan (3.4, 4.9): " + matematikaCanggih.pertambahan(3.4, 4.9));

        // Pengujian metode baru
        double hasilMetodeBaru = matematikaCanggih.metodeBaru(12.5, 28.7, 14.2);
        System.out.println("\nMetode Baru (12.5, 28.7, 14.2): " + hasilMetodeBaru);
    }
}
