import java.util.ArrayList;

public class Partido_politico {
    private String nombre;
    private String direccion;
    private int cant_afiliados;
    private ArrayList<Mensajero> lista_mensajeros;

    public Partido_politico() {
        this.cant_afiliados = 10;
        this.direccion = "XD 123";
        this.lista_mensajeros = new ArrayList<>();
        this.nombre = "Los K";
    }

    public void agregarMensajero(Mensajero mensajero){
        this.lista_mensajeros.add(mensajero);
    }

    public void hacerCampaña(){
        for(Mensajero mensajero : this.lista_mensajeros){
            mensajero.mensaje("Vote por el partido para un mejor futuro");
        }
    }
    public ArrayList<Mensajero> getLista_mensajeros() {
        return lista_mensajeros;
    }

    public void setLista_mensajeros(ArrayList<Mensajero> lista_mensajeros) {
        this.lista_mensajeros = lista_mensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCant_afiliados() {
        return cant_afiliados;
    }

    public void setCant_afiliados(int cant_afiliados) {
        this.cant_afiliados = cant_afiliados;
    }
}
