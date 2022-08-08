public class FuncionCuadratica {
    private float a;
    private float b;
    private float c;
    private float discriminante;

    public FuncionCuadratica(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante = b * b - (4 * a * c);
    }

    public void raices(){
        double raizSuma = (- this.b + Math.sqrt(discriminante)) / 2 * this.a;
        double raizResta = (- this.b - Math.sqrt(discriminante)) / 2 * this.a;
        if(raizResta == raizSuma) System.out.println("su unica raiz es: " + raizResta);
        else System.out.println("X1: " + raizSuma + "/n X2: " + raizResta);
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(float discriminante) {
        this.discriminante = discriminante;
    }
}
