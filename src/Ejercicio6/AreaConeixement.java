package Ejercicio6;

import java.util.HashSet;
import java.util.Set;

public class AreaConeixement {

        private String nombreArea;
        private Set<Departament> departaments;

    public AreaConeixement(String nombreArea) {
        this.nombreArea = nombreArea;
        this.departaments = new HashSet<>();
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public Set<Departament> getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Set<Departament> departaments) {
        this.departaments = departaments;
    }
    public void addDepartaments(Departament departament){
        this.departaments.add(departament);
    }
    @Override
    public String toString(){
        return "Area de Coneixement: " + this.nombreArea;
    }
}
