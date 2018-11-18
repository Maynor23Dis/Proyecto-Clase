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
public class Persona {

        // Nombre de la persona.

        private String nombre;

        // edad de la persona.

        private int edad;

        // altura de la persona.

        private double altura;

        // sexo de la persona.

        private String sexo;

        //Indice de grasa.

        private String salud;
        
       //Ocupacion.
        
        private String ocupacion;
        
        public Persona() {
        }

        /*
        Constructor sobrecargado que inicializa a la persona.
        */

        public  Persona (String nombre,
                          int edad,
                          double altura,
                          String sexo,
                          String salud) {
            this.nombre = nombre;

            this.edad = edad;

            this.altura = altura;

            this.sexo = sexo;

            this.salud = salud;
            
            this.ocupacion = ocupacion;
        }


        /*
        Declaracion de la abstraccion.
        */

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public int getEdad() {
            return this.edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }


        public double getAltura() {
            return this.altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }


        public String getSexo() {
            return this.sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }


        public String getsalud() {
            return this.salud;
        }

        public void setsalud(String salud) {
            this.salud = salud;
        }
          public String getocupacion() {
            return this.ocupacion;
        }

        public void setocupacion(String ocupacion) {
            this.ocupacion = ocupacion;
        }

        /*
       Impresión de la información de las subclases        */

        public void imprimirInformacion() {
            System.out.println("");

            System.out.println("Nombre: " + nombre);

            System.out.println("Edad: " + edad);

            System.out.println("Altura: " + altura);

            System.out.println("Sexo: " + sexo);

            System.out.println("Indice de Grasa: " + salud);
            
            System.out.println("La ocupacion de esta persona es: " + ocupacion);

            System.out.println("");
        }

    } 
