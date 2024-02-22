package ProyectoPropio;

public abstract class Empleado {

    private String dni;
    private String nombre;
    private int edad;
    private String puesto;

    public Empleado(String dni, String nombre, int edad, String puesto) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString(){
        return "DNI: " + this.dni + " Nombre: " + this.nombre + " Edad: " + this.edad + this.puesto;
    }
}
