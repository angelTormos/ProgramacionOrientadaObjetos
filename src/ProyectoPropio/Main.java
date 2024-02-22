package ProyectoPropio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        SistemaOperativo linux = new SistemaOperativo("Linux");
        SistemaOperativo windows = new SistemaOperativo("Windows");
        SistemaOperativo macos = new SistemaOperativo("MacOS");

        LenguajeProgramacion java = new LenguajeProgramacion("Java");
        LenguajeProgramacion c = new LenguajeProgramacion("C++");
        LenguajeProgramacion cobol = new LenguajeProgramacion("Cobol");

        Desarrollador gonzalo = new Desarrollador("24876245R", "Gonzalo", 33, "Desarrollador", java);
        Desarrollador juan = new Desarrollador("24485456T", "Juan", 62, "Desarrollador", c);
        Desarrollador maria = new Desarrollador("87342058F", "Maria", 41, "Desarrollador", cobol);

        Administrador pepe = new Administrador("54875244D", "Pepe", 52, "Administrador", linux);
        Administrador julio = new Administrador("25978412P", "Julio", 20, "Administrador", macos);
        Administrador carlos = new Administrador("57984562F", "Carlos", 37, "Administrador", windows);

        empleados.add(gonzalo);
        empleados.add(juan);
        empleados.add(maria);
        empleados.add(pepe);
        empleados.add(julio);
        empleados.add(carlos);

        for (Empleado e:empleados){
            System.out.println(e);
        }
    }
}