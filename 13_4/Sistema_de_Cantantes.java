import java.util.ArrayList;

public class Sistema_de_Cantantes {
    ArrayList<Cantante> cantantes = new ArrayList<>();

    public Sistema_de_Cantantes (ArrayList<Cantante> cantantes){
        this.cantantes = cantantes;
    }

    public ArrayList<Cantante> obtenerCantantesJovenes (){
        ArrayList<Cantante> cantantesJovenes = new ArrayList<>();
        for (Cantante i : cantantes){
            if (i.esAdultoJoven()){
                cantantesJovenes.add(i);
            }
        }

        return cantantesJovenes;
    }

    public void agregarCancion(String nombreArtistico, String nombreDeLaCancion, int Duracion){
        agregarCancion(nombreArtistico,nombreDeLaCancion,Duracion);
    }
}
