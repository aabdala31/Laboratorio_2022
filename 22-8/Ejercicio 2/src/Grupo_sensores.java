import java.util.HashSet;

public class Grupo_sensores {
    private HashSet<Detector_Humo> detectores_humo;
    private HashSet<Sensor_Presion> sensores_presion;
    private HashSet<Sensor_Temperatura> sensores_temperatura;

    public Grupo_sensores(){
        this.detectores_humo = new HashSet<>();
        this.sensores_presion = new HashSet<>();
        this.sensores_temperatura = new HashSet<>();
    }

    public int calcular_valor_medio(){
        int suma_valores_medida = 0, cant_elementos = 0;
        for (Detector_Humo detector_humo: this.detectores_humo) {
            cant_elementos ++;
            suma_valores_medida += detector_humo.getMedida();
        }
        for (Sensor_Temperatura sensor_temperatura : this.sensores_temperatura) {
            cant_elementos++;
            suma_valores_medida += sensor_temperatura.getMedida();
        }
        for (Sensor_Presion sensor_presion : this.sensores_presion) {
            cant_elementos++;
            suma_valores_medida += sensor_presion.getMedida();
        }
        return suma_valores_medida / cant_elementos;

    }
    public int valorUmbralGrupo(){
        int suma_valor_umbral = 0, cant = 0;
        for (Detector_Humo detector_humo: this.detectores_humo) {
            cant ++;
            suma_valor_umbral += detector_humo.getMedida();
        }
        for (Sensor_Temperatura sensor_temperatura : this.sensores_temperatura) {
            cant++;
            suma_valor_umbral += sensor_temperatura.getMedida();
        }
        for (Sensor_Presion sensor_presion : this.sensores_presion) {
            cant++;
            suma_valor_umbral += sensor_presion.getMedida();
        }
        return suma_valor_umbral / cant;
    }
    public void bucleContinuo(){
        boolean elementoDesconectado = false;
        while (!elementoDesconectado){
           for (Sensor_Temperatura sensor_temperatura : this.sensores_temperatura)
               if(sensor_temperatura.getEstado().equals("desconectado")) elementoDesconectado = true;
           for (Sensor_Presion sensor_presion : this.sensores_presion)
               if(sensor_presion.getEstado().equals("desconectado")) elementoDesconectado = true;
           for (Detector_Humo detector_humo : this.detectores_humo)
               if(detector_humo.getEstado().equals("desconectado")) elementoDesconectado = true;
            if(calcular_valor_medio() > valorUmbralGrupo()){
                for (Sensor_Presion sensor_presion : this.sensores_presion) sensor_presion.alarma();
                for (Sensor_Temperatura sensor_temperatura: this.sensores_temperatura) sensor_temperatura.alarma();
                for (Detector_Humo detector_humo : this.detectores_humo) detector_humo.alarma();
            }

        }
    }
}
