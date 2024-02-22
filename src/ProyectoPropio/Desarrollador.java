package ProyectoPropio;

public class Desarrollador extends Empleado{

    private LenguajeProgramacion lenguajeProgramacion;

    public Desarrollador(String dni, String nombre, int edad, String puesto, LenguajeProgramacion lenguajeProgramacion) {
        super(dni, nombre, edad, puesto);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public LenguajeProgramacion getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(LenguajeProgramacion lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public String toString(){
        return "DNI: " + getDni() + " | " + "Nombre: " + getNombre() + " | " + "Edad: " + getEdad() + " | " + "Puesto: " + getPuesto() + " | " + "Lenguaje: " + this.lenguajeProgramacion + " ";
    }
}
