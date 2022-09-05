import java.util.ArrayList;

public class Sistema {
    private ArrayList<Grupo_sensores> sensores;

    public Sistema(){
        this.sensores = new ArrayList<>();
    }

    public void agregarGrupo(Grupo_sensores grupo_sensores){
        this.sensores.add(grupo_sensores);
    }

    public void disparar_alarma(){
        for (Grupo_sensores sensores1: this.sensores) {
            sensores1.bucleContinuo();
        }
    }
    public int cantidadSensoresSistema(){
        int cantidadTotal = 0;
        for (Grupo_sensores sensor : this.sensores) {
            cantidadTotal += sensor.cantidadSensores();
        }
        return cantidadTotal;
    }

    public void mostrarElemento(int numero){
        System.out.println(sensores.contains(numero));
    }
}
