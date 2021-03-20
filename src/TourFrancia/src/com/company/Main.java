package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Tour.Persona[] arrayPersonas = new Tour.Persona[5];
        arrayPersonas[0] = new Tour.Persona("Mario", "Colombia", 22);
        arrayPersonas[1] = new Tour.Persona("Pepe", "Francia", 21);
        arrayPersonas[2] = new Tour.Persona("Manuel", "Peru",22);
        arrayPersonas[3] = new Tour.Persona("David", "Italia", 21);
        arrayPersonas[4] = new Tour.Persona("Alberto", "Andorra", 22);
        Tour.Equipos[] arrayEquipos = new Tour.Equipos[7];

        System.out.println("Array sin ordenar por edad");
        Tour.imprimeArrayPersonas(arrayPersonas);

        Arrays.sort(arrayPersonas);
        System.out.println("Array ordenado por edad");
        Tour.imprimeArrayPersonas(arrayPersonas);

        System.out.println("Array Equipos");
        Tour.imprimeArrayEquipos(arrayEquipos);


    }
}
