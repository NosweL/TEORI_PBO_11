/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author lenovo
 */
public class Manager extends Pegawai {

    private int tunjangan;

    Manager(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int getGaji() {
        return super.getGaji();
    }

    public int getTunjangan() {
        return this.tunjangan;
    }
}
