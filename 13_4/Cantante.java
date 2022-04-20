import java.util.ArrayList;

public class Cantante extends Persona {
    public String nombreArtistico;
    ArrayList<Cancion> canciones = new ArrayList<>();

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<String> obtenerCancionesMasLargas (){
        ArrayList<String> cancionesMasLargas = new ArrayList<>();
        for (Cancion i: canciones){
            if(i.getDuracionEnSegundos() > 240){
                cancionesMasLargas.add(i.getNombre());
            }
        }

        return cancionesMasLargas;
    }

    public void agregarCancion(String nombre, int duracionEnSegs){
        Cancion nuevaCancion = null;
        nuevaCancion.setNombre(nombre);
        nuevaCancion.setDuracionEnSegundos(duracionEnSegs);

        canciones.add(nuevaCancion);
    }

}
