public class Ordenadores {

    private String marca;
    private String rendimiento;
    private Integer precio;

    public Ordenadores(String marca, String rendimiento, Integer precio) {
        this.marca = marca;
        this.rendimiento = rendimiento;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return this.marca + " " + this.rendimiento + " " + this.precio + "€";
    }
}
