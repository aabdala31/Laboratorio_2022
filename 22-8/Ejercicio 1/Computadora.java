import java.util.ArrayList;

public class Computadora {
    private ArrayList<Componente> componentes;
    private ArrayList<Componente_entrada> componente_entrada;
    private ArrayList<Componente_salida> componente_salida;

    public float precio_total_computadora(){
        float precio = 0;
        for (Componente_entrada componente : this.componente_entrada)
            precio += componente.precioTotal();
        for (Componente componente : this.componentes)
            precio += componente.precioTotal();
        for (Componente_salida componente_salida : this.componente_salida)
            precio += componente_salida.precioTotal();
        return precio;
    }

    public int total_componentesES(){
         return (this.componente_entrada.size() - 1) + (this.componente_salida.size() - 1);
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<Componente_entrada> getComponente_entrada() {
        return componente_entrada;
    }

    public void setComponente_entrada(ArrayList<Componente_entrada> componente_entrada) {
        this.componente_entrada = componente_entrada;
    }

    public ArrayList<Componente_salida> getComponente_salida() {
        return componente_salida;
    }

    public void setComponente_salida(ArrayList<Componente_salida> componente_salida) {
        this.componente_salida = componente_salida;
    }
}
