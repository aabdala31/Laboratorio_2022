public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(1, 2, 2000);
        String fechas;
        // los 10 dias
        for (int i = 0; i < 10; i++){
            fechas = fecha1.fechaSiguiente();
        }
    }
}