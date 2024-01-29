public class Autor {
    private String nombre;
    private Integer nacimiento;

    public Autor(String nombre, Integer nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString(){
        return this.nombre + " " + this.nacimiento;
    }
}
