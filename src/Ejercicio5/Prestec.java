package Ejercicio5;

public class Prestec {
    private int num_p;
    private int cantidad;
    private Sucursal sucursal;
    private Client client;

    public Prestec(int numP, int cantidad, Sucursal sucursal, Client client) {
        num_p = numP;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.client = client;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString(){
        return this.num_p + " - " + this.cantidad + "€";
    }
}
