public class Main {
    public static void main(String[] args) {
        Partido_politico partido_politico = new Partido_politico();
        Paloma_mensajera paloma_mensajera = new Paloma_mensajera();
        Trabajador trabajador = new Trabajador();
        Telefono_movil telefono_movil = new Telefono_movil();

        partido_politico.agregarMensajero(telefono_movil);
        partido_politico.hacerCampaña();
    }
}
