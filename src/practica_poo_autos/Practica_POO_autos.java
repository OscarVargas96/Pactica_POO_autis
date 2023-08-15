/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_poo_autos;

import java.util.Scanner; // imprtamos packete para lectura de teclado


/**
 *
 * @author Daniel
 */
public class Practica_POO_autos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // llamamos al constructor de lectura del teclado

        Automovil carro = new Automovil(); //llamamos al constructor de la clase automovil

        int km = 0;
        int opc = 0;
        

        System.out.println("desea arracnar el vehiculo?: ");
        opc = sc.nextInt();
        while (opc != 0) {

            carro.arrancar();

            System.out.println("A que velocidad desea ir: ");
            km = sc.nextInt();
            carro.acelerar(km);

            System.out.println("desea Frenar el carro? s/n \n");
            String frena = sc.next();      
                
            if (frena.matches("s") || frena.matches("S") ) {
                carro.frenar();
                System.out.println("Prueba de manejo realizada exitosamente!!!");
                break;
            }else{
                System.out.println("sigan viendo");
            }
        }

    }

}
