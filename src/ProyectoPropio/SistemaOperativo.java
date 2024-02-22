package ProyectoPropio;

import java.util.HashSet;
import java.util.Set;

public class SistemaOperativo{

    private String nombreSO;

    private Set<Desarrollador> desarrolladors;

    public SistemaOperativo(String nombreSO) {
        this.nombreSO = nombreSO;
        this.desarrolladors = new HashSet<>();
    }

    public String getNombreSO() {
        return nombreSO;
    }

    public void setNombreSO(String nombreSO) {
        this.nombreSO = nombreSO;
    }

    public Set<Desarrollador> getDesarrolladors() {
        return desarrolladors;
    }

    public void setDesarrolladors(Set<Desarrollador> desarrolladors) {
        this.desarrolladors = desarrolladors;
    }

    public void addDesarrolladors(Desarrollador desarrollador){
        this.desarrolladors.add(desarrollador);
    }

    @Override
    public String toString(){
        return this.nombreSO;
    }
}
