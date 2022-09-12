import java.time.Year;

public abstract class Caracteristicas_comun implements Prestable{
    private int codigo;
    private String titulo;
    private Year anio_publicacion;

    public Caracteristicas_comun() {
        this.anio_publicacion = Year.now();
        this.codigo = 189289;
        this.titulo = "Vogue";
    }

    public abstract String toString();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Year getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(Year anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }
}
