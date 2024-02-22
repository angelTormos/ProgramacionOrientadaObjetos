package Network;

import java.util.HashSet;
import java.util.Set;

public class Mensaje extends Publicacion{

    private int ID;
    private String texto;

    public Mensaje(Usuario user, String fecha, Integer likes, int ID, String texto) {
        super(user, fecha, likes);
        this.ID = ID;
        this.texto = texto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString(){
        return "Usuario:" + getUser() + " Fecha:" + getFecha() + " ID:" + ID + " Mensaje:" + texto + " Likes:" + getLikes();
    }
}
