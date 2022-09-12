public class Escrito extends Examen{
    private int duracion;
    private float nota;

    @Override
    public boolean aprobado(){
        if(this.nota >= 6 && this.duracion <= 90)
            return true;
        return false;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
