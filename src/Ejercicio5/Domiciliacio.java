package Ejercicio5;

public class Domiciliacio {
    private int num_d;
    private String nombre;
    private CompteCorrent compteCorrent;


    public Domiciliacio(int numD, String nombre) {
        num_d = numD;
        this.nombre = nombre;
        this.compteCorrent = compteCorrent;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CompteCorrent getCompteCorrent() {
        return compteCorrent;
    }

    public void setCompteCorrent(CompteCorrent compteCorrent) {
        this.compteCorrent = compteCorrent;
    }

    @Override
    public String toString(){
        return this.num_d + " - " + this.nombre;
    }
}
