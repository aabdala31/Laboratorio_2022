public class Oral extends Examen {
    private Nota nivel_satisfaccion;

    @Override
    public boolean aprobado() {
        if(this.nivel_satisfaccion.equals(Nota.EXCELENTE) || this.nivel_satisfaccion.equals(Nota.SUFICIENTE))
            return true;
        return false;
    }

    public Nota getNivel_satisfaccion() {
        return nivel_satisfaccion;
    }

    public void setNivel_satisfaccion(Nota nivel_satisfaccion) {
        this.nivel_satisfaccion = nivel_satisfaccion;
    }
}
