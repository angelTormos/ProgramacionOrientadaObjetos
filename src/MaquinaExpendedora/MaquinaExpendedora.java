package MaquinaExpendedora;

public class MaquinaExpendedora {

    private int billete;
    private int cajon;
    private int introducido;

    public MaquinaExpendedora(int billete, int cajon, int introducido) {
        this.billete = billete;
        this.cajon = cajon;
        this.introducido = introducido;
    }

    public int getBillete() {
        return billete;
    }

    public void setBillete(int billete) {
        this.billete = billete;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    public int getIntroducido() {
        return introducido;
    }

    public void setIntroducido(int introducido) {
        this.introducido = introducido;
    }

    public String sacarTiquet() {
        if (this.cajon >= this.introducido - this.billete) {
            this.cajon += this.billete;
            String devolver = getDevolver();
            return "Tiquet" + "\n" + devolver;
        } else {
            return "Introduzca el importe exacto";
        }
    }

    private String getDevolver() {
        String devolver = "";
        if (this.introducido > this.billete) {
            int[] billetes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
            int vuelta = this.introducido - this.billete;
            for (int i = 0; i < billetes.length; i++) {
                int division = vuelta / billetes[i];
                vuelta = vuelta % billetes[i];
                while (division != 0) {
                    this.cajon -= billetes[i];
                    if (this.cajon < 0) {
                        this.cajon = 0;
                    }
                    if (billetes[i] == 500) {
                        devolver += "5€" + " ";
                    } else if (billetes[i] == 200) {
                        devolver += "2€" + " ";
                    } else if (billetes[i] == 100) {
                        devolver += "1€" + " ";
                    } else {
                        devolver += billetes[i] + "cent" + " ";
                    }
                    division--;
                }
            }
        }
        return devolver;
    }
}

