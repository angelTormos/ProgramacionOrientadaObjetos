public class AireAcondicionado {

    private String nombre;
    private Integer temperatura;
    private Integer tempmin;
    private Integer tempmax;

    public AireAcondicionado(String nombre, Integer temperatura, Integer tempmin, Integer tempmax) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.tempmin = tempmin;
        this.tempmax = tempmax;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTempmin() {
        return tempmin;
    }

    public void setTempmin(Integer tempmin) {
        this.tempmin = tempmin;
    }

    public Integer getTempmax() {
        return tempmax;
    }

    public void setTempmax(Integer tempmax) {
        this.tempmax = tempmax;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public int subirTemp() {
        return temperatura++;
    }

    public int bajarTemp() {
        return temperatura--;
    }

    @Override
    public String toString() {
        if (temperatura > tempmax) {
            return this.nombre + " " + this.tempmax;
        } else if (temperatura < tempmin) {
            return this.nombre + " " + this.tempmin;
        } else {
            return this.nombre + " " + this.temperatura;
        }
    }
}
