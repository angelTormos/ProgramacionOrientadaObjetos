package Subastas;

public class MainSubasta {
    public static void main(String[] args) {
        Subasta subasta1 = new Subasta("16-03-2023");
        Lote lote1 = new Lote(54,895);
        Articulo art1 = new Articulo("Televisión",720,lote1);
        Articulo art2 = new Articulo("Mesa cocina",175,lote1);
        Pujador alberto = new Pujador("Alberto");
        Pujador pedro = new Pujador("Pedro");
        subasta1.addLote(lote1);
        lote1.addArticulo(art1);
        lote1.addArticulo(art2);

        System.out.println(subasta1);
        for (Lote l : subasta1.getLotes()){
            System.out.println("\t" + l);
            for (Articulo a : l.getArticulos()){
                System.out.println("\t\t" + a);
            }
        }

        System.out.println("Empieza la subasta: ");
        for (Lote l : subasta1.getLotes()){
            System.out.println("\t" + "Precio salida de: " + l + " = " + l.getPrecioSalida());
        }
        alberto.pujar(lote1,950);
        pedro.pujar(lote1,1000);

    }
}