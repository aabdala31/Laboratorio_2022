import java.time.LocalDate;
import java.util.HashMap;

public class EmpleadoEventual extends Empleado{
    private HashMap<Integer, Float> honorarios_x_hora;
    private int nro_horas_trabajo;
    private LocalDate fecha_termino_contrato;

    @Override
    public float calculoSalario() {
        float salario = 0;
        int contador_horas = 0;
        for (Integer i: this.honorarios_x_hora.keySet()){
            if(contador_horas < nro_horas_trabajo)
                salario += this.honorarios_x_hora.get(i);
            contador_horas ++;
        }
        return salario;
    }
}
