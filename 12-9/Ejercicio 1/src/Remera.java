public class Remera extends Prenda_ropa{
    private int espalda;
    private int contorno;
    private int largo_torso;

    public Remera() {
        super();
        this.contorno = 90;
        this.espalda = 90;
        this.largo_torso = 90;
    }

    public int getEspalda() {
        return espalda;
    }

    public void setEspalda(int espalda) {
        this.espalda = espalda;
    }

    public int getContorno() {
        return contorno;
    }

    public void setContorno(int contorno) {
        this.contorno = contorno;
    }

    public int getLargo_torso() {
        return largo_torso;
    }

    public void setLargo_torso(int largo_torso) {
        this.largo_torso = largo_torso;
    }
}
