package com.company.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pooflix {

    private int capacidad = 15;
    Scanner leer = new Scanner(System.in);
    private List<Material> material;

    public Pooflix() {
        this.material = new ArrayList<>();
    }

    public boolean agregar(Material material){
        if(this.material.size() < capacidad){
            this.material.add(material);
            return true;
        }else {
            return false;
        }
    }
    /*public boolean retirar(short codigo){
        /*Material.forEach(material -> {
            if(codigoUsuario==material.getCodigo())){

            }
        );
        return false;
    }*/

    public Material buscarCodigo(int codigo) {
        Material material = this.material.stream()
                .filter(code -> code.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
        return material;
    }
    public Material buscarNombre(String nombre) {
        Material material = this.material.stream()
                .filter(code -> code.getNombre() == nombre)
                .findFirst()
                .orElse(null);
        return material;
    }

    public Material buscarTipo(String tipo) {
        Material material = this.material.stream()
                .filter(code -> code.getTipo() == tipo)
                .findFirst()
                .orElse(null);
        return material;
    }

    public int calcularDuracionTotal(){
        return 0;
    }
    public void MostrarMateriales() {
        material.forEach(Material -> {
            System.out.println(Material.getNombre()+" --> "+ Material.getTipo()+" --> "+Material.getDuracion()+" --> "
                    +Material.getCodigo());
        });

    }

}
