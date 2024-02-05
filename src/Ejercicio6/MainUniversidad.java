package Ejercicio6;

public class MainUniversidad {
    public static void main(String[] args) {
        AreaConeixement castellano = new AreaConeixement("Castellano");
        Departament lengua = new Departament("Lengua", castellano);
        Profesor martin = new Profesor("Martin", 33, lengua);
        Facultad humanidades = new Facultad("Humanidades");
        Catedra sintaxis = new Catedra("Sintaxis", lengua, humanidades);
        Adscritos ads1 = new Adscritos("24/05/2015", sintaxis, martin);


        castellano.addDepartaments(lengua);
        lengua.addProfesor(martin);
        lengua.addCatedras(sintaxis);
        martin.addAdscritos(ads1);

        System.out.println(castellano);
        for (Departament a : castellano.getDepartaments()) {
            System.out.println("\t" + a);
            for (Profesor p : lengua.getProfesor()) {
                System.out.println("\t\t" + p + " " + p.getAdscritos());
            }
            for (Catedra c : lengua.getCatedras()){
                System.out.println("\t\t\t" + c);
                System.out.println("\t\t\t\t" + c.getFacultad());
            }
        }
    }
}
