import java.util.HashSet;

public class Sistema {
    private HashSet<Alumno> alumnos;

    public int cantAprobados(){
        int cantidad = 0;
        for (Alumno alumno: this.alumnos){
            if (alumno.tieneTodosLosExamenesAprobados()) cantidad++;
        }
        return cantidad;
    }
}
