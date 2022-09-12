import java.time.LocalDate;
import java.time.temporal.IsoFields;

public class Revista extends Caracteristicas_comun{
    private LocalDate fecha_publicacion;

    private Revista(){
        super();
        this.fecha_publicacion = LocalDate.now();
    }

    @Override
    public String toString() {
        String fecha_pub = "fecha publicacion: " + String.valueOf(this.fecha_publicacion) + "\n";
        String titu = "Titulo:" + this.getTitulo() + "\n";
        String codigo = "Codigo: " + String.valueOf(this.getCodigo()) + "\n";
        String anio_pub = "Año publicacion: " + String.valueOf(this.getAnio_publicacion()) + "\n";
        return fecha_pub + titu + codigo + anio_pub;
    }

    @Override
    public boolean prestar() {
        LocalDate dia_hoy = LocalDate.now();
        int trimestre_actual = dia_hoy.get(IsoFields.QUARTER_OF_YEAR); // te muestra en que trimestre esta
        int trimestre_fecha_publicacion = this.fecha_publicacion.get(IsoFields.QUARTER_OF_YEAR);

        if(trimestre_actual != trimestre_fecha_publicacion && dia_hoy.getYear() <= this.fecha_publicacion.getYear()) {
            System.out.println("La revista se dará prestada");
            return true;
        }
        System.out.println("La revista no se prestará");
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
