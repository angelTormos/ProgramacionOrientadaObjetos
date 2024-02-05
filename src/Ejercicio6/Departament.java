package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Departament {

    private String nom_dep;
    private Set<Profesor> profesor;
    private AreaConeixement areaConeixement;
    private Set<Catedra> catedras;
    public Departament(String nomDep, AreaConeixement areaConeixement) {
        this.nom_dep = nomDep;
        this.areaConeixement = areaConeixement;
        this.catedras = new HashSet<>();
        this.profesor = new HashSet<>();
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }
    public Set<Profesor> getProfesor() {
        return profesor;
    }
    public void setProfesor(Set<Profesor> profesor) {
        this.profesor = profesor;
    }
    public void addProfesor(Profesor profesor) {
        this.profesor.add(profesor);
    }
    public AreaConeixement getAreaConeixement() {
        return areaConeixement;
    }
    public void setAreaConeixement(AreaConeixement areaConeixement) {
        this.areaConeixement = areaConeixement;
    }
    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }
    public Set<Catedra> getCatedras() {
        return catedras;
    }
    public void addCatedras(Catedra catedra){
        this.catedras.add(catedra);
    }
    @Override
    public String toString(){
        return "Departament: " + this.nom_dep;
    }
}
