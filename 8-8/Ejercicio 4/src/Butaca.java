public class Butaca {
    private int fila;
    private char columna;
    private boolean estaOcupado;

    public Butaca() {
        this.fila = 1;
        this.columna = 'A';
        this.estaOcupado = false;
    }
    public Butaca(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.estaOcupado = false;
    }
    public boolean isEstaOcupado() {
        return estaOcupado;
    }

    public void setEstaOcupado(boolean estaOcupado) {
        this.estaOcupado = estaOcupado;
    }
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }
}
