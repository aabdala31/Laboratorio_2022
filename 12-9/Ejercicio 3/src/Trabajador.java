import java.time.LocalTime;

public class Trabajador extends Persona implements Mensajero{
    private int cuil;
    private float sueldo;
    private int hora_laboral_inicial;
    private int hora_laboral_final;
    private String direccion;

    public Trabajador() {
        super();
        this.cuil = 12;
        this.sueldo = 60000;
        this.direccion = "Lol 123";
        this.hora_laboral_inicial = LocalTime.now().getHour();
        this.hora_laboral_final = LocalTime.now().getHour() + 8;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void mensaje(String mensaje) {
        if(this.hora_laboral_final >= LocalTime.now().getHour() || this.hora_laboral_inicial <= LocalTime.now().getHour())
            System.out.println("Yo " + this.getNombre() + " te invito a que " + mensaje);
    }
}
