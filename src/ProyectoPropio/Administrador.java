package ProyectoPropio;

public class Administrador extends Empleado{

    private SistemaOperativo sistemaOperativo;

    public Administrador(String dni, String nombre, int edad, String puesto, SistemaOperativo sistemaOperativo) {
        super(dni, nombre, edad, puesto);
        this.sistemaOperativo = sistemaOperativo;
    }

    public SistemaOperativo getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(SistemaOperativo sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String toString(){
        return "DNI: " + getDni() + " | " + "Nombre: " + getNombre() + " | " + "Edad: " + getEdad() + " | " + "Puesto: " + getPuesto() + " | " + "Sistema Operativo: " + this.sistemaOperativo + " ";
    }
}
