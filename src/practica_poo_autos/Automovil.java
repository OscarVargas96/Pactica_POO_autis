/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_poo_autos;

/**
 *
 * @author Daniel
 */
public class Automovil {

    static private String color, marca, modelo;
    static private int caballos; // cabbalos de fuerza del motor

    void arrancar() {
        System.out.println("arrancando");
    }

     void acelerar(int km) { 
        System.out.println("vamos a: "+km+" KM/H");
    }
     
      void frenar() {
        System.out.println("Frenooooo");
    }
    
}
