import java.time.LocalDateTime;
import java.util.HashMap;

public class Medico extends Persona{
    private String especialidad;
    private String servicio;
    private int nro_consultorio;
    private int codigo;
    public HashMap<LocalDateTime, Paciente> citas_por_dia;

    public HashMap<LocalDateTime, Paciente> getCitas_por_dia() {
        return citas_por_dia;
    }

    public void setCitas_por_dia(HashMap<LocalDateTime, Paciente> citas_por_dia) {
        this.citas_por_dia = citas_por_dia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getNro_consultorio() {
        return nro_consultorio;
    }

    public void setNro_consultorio(int nro_consultorio) {
        this.nro_consultorio = nro_consultorio;
    }

}
