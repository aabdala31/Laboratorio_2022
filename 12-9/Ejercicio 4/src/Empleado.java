import java.time.LocalDate;

public abstract class Empleado extends Persona implements Calculos{
    private int codigo;
    private int nro_horas_extra;
    private LocalDate fechaIngreso;
    private String area;
    private String cargo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNro_horas_extra() {
        return nro_horas_extra;
    }

    public void setNro_horas_extra(int nro_horas_extra) {
        this.nro_horas_extra = nro_horas_extra;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
