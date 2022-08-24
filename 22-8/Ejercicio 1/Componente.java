import java.util.ArrayList;

public class Componente {
    private String nombre_fabricante;
    private String modelo;
    private float precioInicial;
    private static float inflacion = 5.6f;
    private int stock;
    private ArrayList<String> puertosValidos;

    public float precioTotal(){
        return this.precioInicial + this.precioInicial * inflacion / 100;
    }

    public String getNombre_fabricante() {
        return nombre_fabricante;
    }

    public void setNombre_fabricante(String nombre_fabricante) {
        this.nombre_fabricante = nombre_fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(float precioInicial) {
        this.precioInicial = precioInicial;
    }

    public static float getInflacion() {
        return inflacion;
    }

    public static void setInflacion(float inflacion) {
        Componente.inflacion = inflacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<String> getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(ArrayList<String> puertosValidos) {
        this.puertosValidos = puertosValidos;
    }
}
