package Network;

import java.util.Set;

public class Fotografia extends Publicacion{

    private String archvio;
    private String titulo;

    public Fotografia(Usuario user, String fecha, Integer likes, String archvio, String titulo) {
        super(user, fecha, likes);
        this.archvio = archvio;
        this.titulo = titulo;
    }

    public String getArchvio() {
        return archvio;
    }

    public void setArchvio(String archvio) {
        this.archvio = archvio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString(){
        return "Usuario:" + getUser() + " Fecha:" + getFecha() + " Archivo:" + archvio + " Mensaje:" + titulo + " Likes:" + getLikes();
    }
}
