public abstract class Dispositivo {
    private int nro_serie;
    private String fabricante;
    private String modelo;

    public Dispositivo() {
        this.nro_serie = 1281;
        this.fabricante = "Apple";
        this.modelo = "Iphone 13";
    }

    public int getNro_serie() {
        return nro_serie;
    }

    public void setNro_serie(int nro_serie) {
        this.nro_serie = nro_serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
