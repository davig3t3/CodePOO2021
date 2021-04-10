package com.company;



import com.company.dominio.Material;
import com.company.dominio.Pooflix;
import com.company.dominio.TipoMaterial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int capacidad = 15;
        Pooflix pooflix = new Pooflix();
        Scanner leer = new Scanner(System.in);

        Material IronMan= new Material(12, "IronMan",01,"asd");
        Material Avengers= new Material(54,"Avengers",02,"qwerty");
        Material AvengersEndGame= new Material(3,"AvengersEndGame",03,"qwerty");




        pooflix.agregar(IronMan);
        pooflix.agregar(Avengers);
        pooflix.agregar(AvengersEndGame);
        pooflix.MostrarMateriales();

        System.out.println("ingrese codigo del material que desea buscar:");
        int codigo = leer.nextInt();
        pooflix.buscarCodigo(codigo);
        System.out.println("ingrese nombre del material que desea buscar:");
        String nombre = leer.next();
        pooflix.buscarNombre(nombre);





    }
}
