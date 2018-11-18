/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author MaynorPC
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Comienzo.

        System.out.println("-> Estudiante");

        //  Primer animal heredado será un perro.
        Estudiante es = new Estudiante();

        // Imprimir la información del animal.

        es.imprimirInformacion();


        //Segundo animal heredado será un gato.

        System.out.println("-> Deportista");

        // Instancia del animal.

        Deportista dep = new Deportista();

        // Imprimir la información del animal.

        dep.imprimirInformacion();


    }
    
}
