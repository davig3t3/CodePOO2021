package com.company;

public class Tour {

    public static class Persona implements Comparable<Persona> {

        public String nombre, equipo, nombreEquipo;
        public int edad;
        // Constructor de la clase
        public Persona(String nombre, String equipo, int edad) {
            this.nombre = nombre;
            this.equipo = equipo;
            this.edad = edad;
        }

        @Override
        public int compareTo(Persona o) {
            if (edad < o.edad) {
                return -1;
            }
            if (edad > o.edad) {
                return 1;
            }
            return 0;
        }
    }

    public static class Equipos {

        public String nombreEquipos;
        // Constructor de la clase
        public Equipos(String nombreEquipos) {
            this.nombreEquipos = nombreEquipos;
        }

    }

    static void imprimeArrayPersonas(Persona[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i].nombre + " - Equipo: " + array[i].equipo + " - Edad: " + array[i].edad);
        }
    }

    static void imprimeArrayEquipos(Equipos[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + "Nombre del equipo" + array[i].nombreEquipos);
        }
    }




}
