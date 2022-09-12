import java.time.LocalDate;

public abstract class Examen {
    private LocalDate fecha_realizacion;

    public abstract boolean aprobado();

    public LocalDate getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(LocalDate fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }
}
