import java.util.ArrayList;

public class Alumno {
    private int dni;
    private String apellido;
    private String nombre;
    private ArrayList<Escrito> examenes_E;
    private ArrayList<Oral> examenes_O;


    public boolean tieneTodosLosExamenesAprobados(){
        boolean examenAprobado = true;
        for (Escrito escritoExamen : this.examenes_E)
            if (!escritoExamen.aprobado()) examenAprobado = false;
        for (Oral oralExamen : this.examenes_O)
            if (!oralExamen.aprobado()) examenAprobado = false;
        return examenAprobado;
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escrito> getExamenes_E() {
        return examenes_E;
    }

    public void setExamenes_E(ArrayList<Escrito> examenes_E) {
        this.examenes_E = examenes_E;
    }

    public ArrayList<Oral> getExamenes_O() {
        return examenes_O;
    }

    public void setExamenes_O(ArrayList<Oral> examenes_O) {
        this.examenes_O = examenes_O;
    }
}
