public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    public Pelicula() {
        this.director = "steven Spielberg";
        this.duracion = 140;
        this.edadMinima = 16;
        this.titulo = "Jurassic Park";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
