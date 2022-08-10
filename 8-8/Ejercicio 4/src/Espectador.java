public class Espectador {
    private String nombre;
    private int edad;
    private float dinero;

    public Espectador() {
        this.nombre = "juliancito";
        this.edad = 13;
        this.dinero = 15.5f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
}
