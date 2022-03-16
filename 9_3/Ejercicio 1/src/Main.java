import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Float> listaPrecios = new ArrayList<>();
        boolean salir = false;

        while (salir == false) {
            System.out.println("Buena' Tarde'");
            System.out.println("Que queres hacer?");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Imprimir Importe a Pagar");
            System.out.println("3 Lo' vemo'");

            Scanner ingresoOpciones = new Scanner(System.in);
            String opcionElegida = ingresoOpciones.nextLine();

            switch (opcionElegida) {
                case "1":
                    System.out.println("Ingrese el nombre del producto");
                    Scanner nombreProducto = new Scanner(System.in);
                    String nombre = nombreProducto.nextLine();

                    System.out.println("Ingrese el precio del producto");
                    Scanner precioProducto = new Scanner(System.in);
                    float precio = precioProducto.nextFloat();
                    listaPrecios.add(precio);

                    break;

                case "2":
                    float total = 0;
                    for (int i = 0; i <= listaPrecios.size()-1; i++) {
                        total += listaPrecios.get(i);
                    }
                    System.out.println("Su total es: ");
                    System.out.println(total);
                    break;
                case "3":
                    salir = true;
            }
        }
    }
}

