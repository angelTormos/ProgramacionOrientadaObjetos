package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Profesor {

    private String nombre;
    private int edad;
    private Departament departaments;
    private Set<Adscritos> adscritos;


    public Profesor(String nombre, int edad, Departament departaments) {
        this.nombre = nombre;
        this.edad = edad;
        this.departaments = departaments;
        this.adscritos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Departament getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Departament departaments) {
        this.departaments = departaments;
    }

    public Set<Adscritos> getAdscritos() {
        return adscritos;
    }

    public void setAdscritos(Set<Adscritos> adscritos) {
        this.adscritos = adscritos;
    }

    public void addAdscritos(Adscritos adscritos){
        this.adscritos.add(adscritos);
    }
    @Override
    public String toString(){
        return "Nom Professor: " + this.nombre + "-" + this.edad;
    }
}
