/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2;

/**
 *
 * @author lenovo
 */
public class TestElektronik {

    public static void main(String[] args) {
        Manusia indro = new Manusia();
        
        TelevisiJadul tvjadul = new TelevisiJadul();
        
        TelevisiModern tvmodern = new TelevisiModern();

        indro.nyalakanPerangkat(tvjadul);
        indro.nyalakanPerangkat(tvmodern);

    }
}
