public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Alfredo", 100.0);
        Cuenta c2 = new Cuenta("Paco", 1500.0);
        Cuenta c3 = new Cuenta("Pepe");
        Cuenta c4 = new Cuenta("Andres", 1000.0);

        c1.retirar(2000);
        c1.ingresar(-50);
        c1.retirar(40);
        c1.retirar(300);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

    }
}
