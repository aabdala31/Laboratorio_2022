public class Sensor_Presion extends Elemento{
    public Sensor_Presion() {
        super();
    }

    @Override
    void alarma(){
        System.out.println("Sensor de presión activado");
    }
}
