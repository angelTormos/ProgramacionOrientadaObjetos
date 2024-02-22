package Network;

import Ejercicio6.Departament;

import java.util.HashSet;
import java.util.Set;

public abstract class Publicacion {

    private Usuario user;
    private String fecha;
    private Integer likes;
    private Set<String> comentarios;


    public Publicacion(Usuario user, String fecha, Integer likes) {
        this.user = user;
        this.fecha = fecha;
        this.likes = likes;
        this.comentarios = new HashSet<>();
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }


    public void setComentarios(Set<String> comentarios) {
        this.comentarios = comentarios;
    }

    public void addComentarios(String comentarios){
        this.comentarios.add(comentarios);
    }

    @Override
    public String toString(){
        return this.user + this.fecha + this.likes + this.comentarios;
    }
}
