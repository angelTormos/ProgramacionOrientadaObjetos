package MaquinaExpendedora;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MaquinaExpendedora billete1 = new MaquinaExpendedora(120, 400, 500);

        System.out.println(billete1.sacarTiquet());
        System.out.println(billete1.getCajon());
    }
}