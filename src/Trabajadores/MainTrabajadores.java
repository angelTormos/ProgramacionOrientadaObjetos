package Trabajadores;

public class MainTrabajadores {
    public static void main(String[] args) {
        Operario op1 = new Operario("Alfredo");
        Directivo d1 = new Directivo("Marta");
        Oficial of1 = new Oficial("Pedro");
        Tecnico t1 = new Tecnico("Esteban");

        System.out.println(op1);
        System.out.println(d1);
        System.out.println(of1);
        System.out.println(t1);
    }
}
