public class Telefono_movil extends Dispositivo implements Mensajero{
    private Compania_telefonica compania_telefonica;
    private int nro_celular;
    private boolean estaPrendido;
    private float credito;

    public Telefono_movil() {
        super();
        this.compania_telefonica = Compania_telefonica.MOVISTAR;
        this.nro_celular = 187928192;
        this.estaPrendido = true;
        this.credito = 780;
    }

    public Compania_telefonica getCompania_telefonica() {
        return compania_telefonica;
    }

    public void setCompania_telefonica(Compania_telefonica compania_telefonica) {
        this.compania_telefonica = compania_telefonica;
    }

    public int getNro_celular() {
        return nro_celular;
    }

    public void setNro_celular(int nro_celular) {
        this.nro_celular = nro_celular;
    }

    public boolean isEstaPrendido() {
        return estaPrendido;
    }

    public void setEstaPrendido(boolean estaPrendido) {
        this.estaPrendido = estaPrendido;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    @Override
    public void mensaje(String mensaje) {
        if(estaPrendido && this.credito > 0)
            System.out.println("Conectando con la antena mas cercana " + mensaje);
    }
}
