public class Prenda_ropa implements Prestable{
    private String color;
    private Material tipo_material;
    private String marca;
    private Estado estado;

    public Prenda_ropa() {
        this.color = "Violeta";
        this.tipo_material = Material.ALGODON;
        this.marca = "Gucci";
        this.estado = Estado.BUENO;
    }

    public String toString(){
        String coloor = "Color: " + this.color + "\n";
        String material = "Tipo material: " + String.valueOf(this.tipo_material) + "\n";
        String marka = "Marca: " + this.marca + "\n";
        String status = "Estado: " + String.valueOf(this.estado) + "\n";
        return coloor + material + marka + status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Material getTipo_material() {
        return tipo_material;
    }

    public void setTipo_material(Material tipo_material) {
        this.tipo_material = tipo_material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean prestar() {
        if (this.estado.equals(Estado.BUENO)) {
            System.out.println("La prenda de ropa se dara prestada");
            return true;
        }
        System.out.println("La prenda de ropa no se prestará");
        return false;
    }

    @Override
    public boolean agregarElemento(){
        if(prestar()) {
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
            return true;
        }
        System.out.println("El articulo ingresado no podrá ingresar a nuestro sistema");
        return false;
    }
}
