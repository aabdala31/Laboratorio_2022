public class Cuenta {
    private String nombreCliente;
    private int numeroCuenta;
    private float tipoInteres;
    private float saldo;

    public Cuenta(String nombreCliente, int numeroCuenta, float tipoInteres, float saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(String nombreCliente, int numeroCuenta) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = 25.5f;
        this.saldo = 10000;
    }

    public Cuenta() {
        this.nombreCliente = "jaime";
        this.numeroCuenta = 90290893;
        this.tipoInteres = 10.6f;
        this.saldo = 15;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(float tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void ingresoDinero(float dineroAIngresar) {
        float saldoTotal = dineroAIngresar + this.saldo;
        setSaldo(saldoTotal);
    }

    public boolean extraerDinero(float dineroAExtraer){
        if(dineroAExtraer <= this.saldo){
            setSaldo(this.saldo - dineroAExtraer);
            return true;
        }
        return false;
    }

    public void transferenciaBancaria(float importe, Cuenta cuentaATransferir){
        if (extraerDinero(importe))
            cuentaATransferir.ingresoDinero(((cuentaATransferir.getTipoInteres() * importe) / 100) - importe);
        else System.out.println("no podes queen");
    }
}
