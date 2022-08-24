import java.time.Year;

public abstract class Elemento {
    private String estado;
    private int medida;
    private static int valor_umbral;
    private Year anio_adquirido;

    private boolean medidaSuperaUmbral(){
        if(this.medida > valor_umbral) {
            alarma();
            return true;
        }
        return false;
    }

    abstract void alarma();
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public static int getValor_umbral() {
        return valor_umbral;
    }

    public static void setValor_umbral(int valor_umbral) {
        Elemento.valor_umbral = valor_umbral;
    }

    public Year getAnio_adquirido() {
        return anio_adquirido;
    }

    public void setAnio_adquirido(Year anio_adquirido) {
        this.anio_adquirido = anio_adquirido;
    }
}
