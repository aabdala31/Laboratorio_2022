import java.util.HashMap;

public class Libro extends Caracteristicas_comun{
    private HashMap<Integer, Integer> cantidad_paginas_por_cap;

    public Libro() {
        super();
        this.cantidad_paginas_por_cap = new HashMap<>();
    }

    public int cantidad_capitulos(){
        int cantidad_capitulos = 0;
        for (int capitulos: this.cantidad_paginas_por_cap.keySet())
            cantidad_capitulos ++;
        return cantidad_capitulos;
    }

    @Override
    public String toString() {
        String capitulos = "Capitulos: " + String.valueOf(cantidad_capitulos()) + "\n";
        String titu = "Titulo:" + this.getTitulo() + "\n";
        String codigo = "Codigo: " + String.valueOf(this.getCodigo()) + "\n";
        String anio_pub = "Año publicacion: " + String.valueOf(this.getAnio_publicacion()) + "\n";
        return capitulos + titu + codigo + anio_pub;
    }


    @Override
    public boolean prestar() {
        if (cantidad_capitulos() % 2 == 1) {
            System.out.println("El libro se dará prestado");
            return true;
        }
        System.out.println("El libro no se prestará");
        return false;
    }

    @Override
    public boolean agregarElemento() {
        if(prestar()) {
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return true;
        }
        System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
        return false;
    }
}
