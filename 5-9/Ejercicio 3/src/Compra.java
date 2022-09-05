import java.util.HashMap;
import java.util.HashSet;

public class Compra {
    private Cliente cliente;
    private Metodo_pago metodo_pago;
    private HashSet<Computadora> computadorasVendidas;
    private HashMap<Componente, Integer> componentes;
    private HashMap<Componente_entrada, Integer> componentes_entrada;
    private HashMap<Componente_salida, Integer> componentes_salida;

    public Compra(){
        this.cliente = new Cliente();
        this.metodo_pago = new Metodo_pago();
        this.componentes_entrada = new HashMap<>();
        this.componentes = new HashMap<>();
        this.componentes_salida = new HashMap<>();
        this.computadorasVendidas = new HashSet<>();
    }

    public boolean sePuedeRealizar(){
        if(this.componentes_salida.isEmpty() || this.componentes.isEmpty() || this.componentes_entrada.isEmpty())
            return false;
        return true;
    }


    public void realizarCompra(){
        try {
            if(!sePuedeRealizar())
                throw new Exception("No se puede realizar la compra");
        }
        catch (Exception e){
            System.err.println(e);
        }
        Computadora computadora_A_Vender = new Computadora();
        int stock = 0;
        for (Componente componente: this.componentes.keySet()){
            computadora_A_Vender.getComponentes().add(componente);
            try {
                if(componente.getStock() < 0)
                    throw new Exception("NO hay stock");
            }
            catch (Exception e){
                System.err.println(e);
            }
            stock = componente.getStock();
            componente.setStock(stock - this.componentes.get(componente));
        }
        for (Componente_entrada componente: this.componentes_entrada.keySet()){
            computadora_A_Vender.getComponente_entrada().add(componente);
            try {
                if(componente.getStock() < 0)
                    throw new Exception("NO hay stock");
            }
            catch (Exception e){
                System.err.println(e);
            }
            stock = componente.getStock();
            componente.setStock(stock - this.componentes_entrada.get(componente));
        }
        for (Componente_salida componente : this.componentes_salida.keySet()){
            computadora_A_Vender.getComponente_salida().add(componente);
            try {
                if(componente.getStock() < 0)
                    throw new Exception("NO hay stock");
            }
            catch (Exception e){
                System.err.println(e);
            }
            stock = componente.getStock();
            componente.setStock(stock - this.componentes_salida.get(componente));
        }

        this.computadorasVendidas.add(computadora_A_Vender);
        System.out.println("se realizo la compra");
    }

    public int cantidad_componentesES(Computadora computadora){
        int cantidad = 0;
        for (Computadora compu : this.computadorasVendidas){
            if(compu.equals(computadora))
                cantidad = compu.total_componentesES();
        }
        return  cantidad;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Metodo_pago getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(Metodo_pago metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public HashSet<Computadora> getComputadorasVendidas() {
        return computadorasVendidas;
    }

    public void setComputadorasVendidas(HashSet<Computadora> computadorasVendidas) {
        this.computadorasVendidas = computadorasVendidas;
    }

    public HashMap<Componente, Integer> getComponentes() {
        return componentes;
    }

    public void setComponentes(HashMap<Componente, Integer> componentes) {
        this.componentes = componentes;
    }

    public HashMap<Componente_entrada, Integer> getComponentes_entrada() {
        return componentes_entrada;
    }

    public void setComponentes_entrada(HashMap<Componente_entrada, Integer> componentes_entrada) {
        this.componentes_entrada = componentes_entrada;
    }

    public HashMap<Componente_salida, Integer> getComponentes_salida() {
        return componentes_salida;
    }

    public void setComponentes_salida(HashMap<Componente_salida, Integer> componentes_salida) {
        this.componentes_salida = componentes_salida;
    }
}
