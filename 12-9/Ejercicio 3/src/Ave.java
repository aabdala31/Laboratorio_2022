public abstract class Ave {
    private String color;
    private String nombre;
    private static String especie;

    public Ave() {
        this.color = "Blanca";
        this.nombre = "Paloma";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Ave.especie = especie;
    }
}

