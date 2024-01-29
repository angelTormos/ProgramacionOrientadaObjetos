public class MainOrdenadores {
    public static void main(String[] args) {

        Ordenadores Ordenador1 = new Ordenadores("Dell", "Bajo",225 );
        Ordenadores Ordenador2 = new Ordenadores("Lenovo", "Medio", 300);
        Ordenadores Ordenador3 = new Ordenadores("MSI", "Bajo",250 );
        Ordenadores Ordenador4 = new Ordenadores("Asus", "Alto", 1800);

        System.out.println(Ordenador1);
        System.out.println(Ordenador2);
        System.out.println(Ordenador3);
        System.out.println(Ordenador4);
    }
}
