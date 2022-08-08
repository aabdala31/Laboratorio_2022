public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta("LILA", 819191);

        // metodo de ingreso dinero
        cuenta1.ingresoDinero(89);

        // metodo de extraccion
        if (cuenta1.extraerDinero(100)) System.out.println("se pudo extraer dinero");
        else System.out.println("no se pudo extraer dinero");

        // metodo transferencia
        cuenta2.transferenciaBancaria(1900, cuenta1);
    }
}