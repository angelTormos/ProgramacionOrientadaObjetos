package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private Integer n_ent;
    private String nombre;
    private Set<Sucursal> sucursales;

    public Banco(Integer n_ent, String nombre, Set<Sucursal> sucursales) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        this.sucursales = new HashSet<>();
    }

    public Integer getN_ent(){
        return n_ent;
    }

    public void setN_ent(Integer n_ent) {
        this.n_ent = n_ent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    public void addSucursales(Sucursal sucursales) {
        this.sucursales.add(sucursales);
    }

    @Override
    public String toString(){
        return this.n_ent + " - " + this.nombre;
    }
}