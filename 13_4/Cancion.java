public class Cancion {
    public String nombre;
    public int duracionEnSegundos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public void setDuracionEnSegundos(int duracionEnSegundos) {
        this.duracionEnSegundos = duracionEnSegundos;
    }

    public Cancion (int duracionEnSegundos, String nombre){
        this.duracionEnSegundos = duracionEnSegundos;
        this.nombre = nombre;
    }

    public Cancion (){
        this.duracionEnSegundos = 140;
        this.nombre = "Hola que tal";
    }

    public boolean esUnaCancionLarga(){
        if (this.duracionEnSegundos >= 240) return true;
        else return false;
    }


}
