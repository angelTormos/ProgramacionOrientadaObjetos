package Ejercicio7;

public class Prestec {
    private String data_p;
    private Exemplar exemplar;
    private Lector lector;

    public Prestec(String data_p, Exemplar exemplar, Lector lector) {
        this.data_p = data_p;
        this.exemplar = exemplar;
        this.lector = lector;
    }

    public String getData_p() {
        return data_p;
    }

    public void setData_p(String data_p) {
        this.data_p = data_p;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
    @Override
    public String toString(){
        return "Fecha de prestamo: " + this.data_p;
    }
}
