package Ejercicio4;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private Integer paginas;
    private ArrayList<String>Temas;

    public Libro(String titulo, String autor, Integer paginas, ArrayList<String> temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        Temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }



    public ArrayList<String> getTemas() {
        return Temas;
    }

    public void setTemas(ArrayList<String> temas) {
        Temas = temas;
    }
    @Override
    public String toString() {
        return getTitulo() + " " + getAutor() + " " + getTemas() + " " + getPaginas();
    }
}
