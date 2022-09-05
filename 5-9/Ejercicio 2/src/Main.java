import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Detector_Humo detector_humo = new Detector_Humo();
        Sensor_Presion sensor_presion = new Sensor_Presion();
        Sensor_Temperatura sensor_temperatura = new Sensor_Temperatura();
        Grupo_sensores GrupoAAgregar = new Grupo_sensores();

        GrupoAAgregar.agregarSensores(detector_humo, sensor_presion, sensor_temperatura);
        Sistema sistema = new Sistema();
        sistema.agregarGrupo(GrupoAAgregar);
        sistema.agregarGrupo(GrupoAAgregar);
        sistema.agregarGrupo(GrupoAAgregar);
        sistema.agregarGrupo(GrupoAAgregar);

        int numeroIngresado = 0;
        System.out.println("ingrese un numero: ");
        try {
            Scanner scanner = new Scanner(System.in);
            numeroIngresado = scanner.nextInt();
        }
        catch (Exception e) {
            System.err.println("No ingresas un numero entero");
        }

        try {
            if (sistema.cantidadSensoresSistema() <= numeroIngresado)
                throw new ClaseExcepcion("El numero ingresado es mas grande");
            sistema.mostrarElemento(numeroIngresado);
        } catch (ClaseExcepcion e) {
            System.out.println(e);
        }
    }
  }
