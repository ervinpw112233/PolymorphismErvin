/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggih extends Matematika {
     public void pertambahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.println("Hasil pertambahan double: " + hasil);
    }

    public void pengurangan(double a, double b, double c) {
        double hasil = a - b - c;
        System.out.println("Hasil pengurangan double: " + hasil);
    }

    public void perkalian(double a, double b, double c) {
        double hasil = a * b * c;
        System.out.println("Hasil perkalian double: " + hasil);
    }

    public void pembagian(double a, double b, double c) {
        double hasil = a / b / c;
        System.out.println("Hasil pembagian double: " + hasil);
    }

    public void modulus(double a, double b, double c) {
        double hasil = a % b % c;
        System.out.println("Hasil modulus double: " + hasil);
    }
}
