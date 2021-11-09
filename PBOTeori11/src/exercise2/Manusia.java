/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2;

/**
 *
 * @author lenovo
 */
public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {

        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi jadul dengan input: " + ((TelevisiJadul) perangkat).getModelInput());

            System.out.println("Voltase televisi: " + perangkat.getVoltase());

        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi modern dengan input: " + ((TelevisiModern) perangkat).getModelInput());

            System.out.println("Voltase televisi: " + perangkat.getVoltase());

        }
    }

}
