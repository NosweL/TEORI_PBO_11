/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author lenovo
 */
public class TestBayaran {

    public static void main(String[] args) {

        Manager man = new Manager("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Bayaran untuk manajer: " + hr.hitungBayaran(man));
        System.out.println("Bayaran untuk programmer: " + hr.hitungBayaran(prog));
    }
}
