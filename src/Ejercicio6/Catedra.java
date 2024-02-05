package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String nom_cat;
    private Departament departament;
    private Facultad facultad;
    private Set<Adscritos> adscritos;

    public Catedra(String nomCat, Departament departament, Facultad facultad) {
        this.nom_cat = nomCat;
        this.departament = departament;
        this.facultad = facultad;
        this.adscritos = new HashSet<>();
    }

    public String getNom_cat() {
        return nom_cat;
    }

    public void setNom_cat(String nom_cat) {
        this.nom_cat = nom_cat;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
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
    return "Catedra: " + this.nom_cat;
    }
}
