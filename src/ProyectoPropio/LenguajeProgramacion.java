package ProyectoPropio;

import java.util.HashSet;
import java.util.Set;

public class LenguajeProgramacion{

    private String nombreLenguaje;
    private Set<Administrador> administradors;

    public LenguajeProgramacion(String nombreLenguaje) {
        this.nombreLenguaje = nombreLenguaje;
        this.administradors = new HashSet<>();
    }

    public String getNombreLenguaje() {
        return nombreLenguaje;
    }

    public void setNombreLenguaje(String nombreLenguaje) {
        this.nombreLenguaje = nombreLenguaje;
    }

    public Set<Administrador> getAdministradors() {
        return administradors;
    }

    public void setAdministradors(Set<Administrador> administradors) {
        this.administradors = administradors;
    }

    public void addAdministrador(Administrador administrador){
        this.administradors.add(administrador);
    }

    @Override
    public String toString(){
        return this.nombreLenguaje;
    }
}
