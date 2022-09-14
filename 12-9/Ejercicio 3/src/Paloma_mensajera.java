public class Paloma_mensajera extends Ave implements Mensajero{
    private boolean aprendio_mapa;

    public Paloma_mensajera() {
        super();
        this.aprendio_mapa = true;
    }

    public boolean isAprendio_mapa() {
        return aprendio_mapa;
    }

    public void setAprendio_mapa(boolean aprendio_mapa) {
        this.aprendio_mapa = aprendio_mapa;
    }

    @Override
    public void mensaje(String mensaje) {
        if(this.aprendio_mapa)
            System.out.println("Lanzando un papelito que dice: " + mensaje);
    }
}
