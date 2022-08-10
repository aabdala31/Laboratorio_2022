import java.util.HashSet;
import java.util.Random;

public class Cine {
    private HashSet<Butaca> butacas;
    private Pelicula pelicula;
    private float precioEntrada;
    private HashSet<Espectador> espectadores;

    public Cine(){
        this.butacas = new HashSet<>();
        this.espectadores = new HashSet<>();
        this.pelicula = new Pelicula();
        this.precioEntrada = 5;
    }

    public boolean estaOcupado(Butaca butacaAOcupar){
        for (Butaca asiento : this.butacas) {
            if(butacaAOcupar == asiento && asiento.isEstaOcupado()) return true;
        }
        return false;
    }

    public boolean puedeIngresar(Espectador espectador){
        if(espectador.getDinero() >= this.precioEntrada && espectador.getEdad() >= this.pelicula.getEdadMinima())
            return true;
        return false;
    }

    public Butaca asignarButaca(){
        Random randomChar = new Random();
        Random randomInt = new Random();
        int fila = randomInt.nextInt(3) + 1; // te devuelve numeros de 1 al 4
        char columna = (char)(randomChar.nextInt(8) + 'a'); // se pone el + 'a' porque esta en la posicion 0.
        Butaca butaca = new Butaca(fila, columna);
        return butaca;
    }

    public void verPelicula(int fila, char columna, Espectador espectadorAEntrar){
        Butaca butacaAOcupar = asignarButaca();
        while (estaOcupado(butacaAOcupar)) butacaAOcupar = asignarButaca();

        if (puedeIngresar(espectadorAEntrar)){
            butacaAOcupar.setEstaOcupado(true);
            this.butacas.add(butacaAOcupar);
            this.espectadores.add(espectadorAEntrar);
            System.out.println("pudo entrar al cine");
        }

        System.out.println("no puede entrar al cine :(");
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public HashSet<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(HashSet<Espectador> espectadores) {
        this.espectadores = espectadores;
    }
}
