public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona(){
        this.nombre = "Pepito";
        this.edad = 15;
        this.dni = 12345678;
        this.telefono = 1112345678;
        this.direccion = "Av. Constituyentes 123";
    }

    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = 0;
        this.dni = 0;
        this.telefono = 0;
        this.direccion = " ";
    }

    public Persona(String nombre, int edad, int dni, int telefono, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getDni(){
        return this.dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public boolean esMayorDeEdad(int e2){
        return this.edad > e2;
    }

    public boolean sonLaMismaPersona(Persona p){
        return this == p;
    }

    public boolean tienenLaMismaEdad(int e2){
        return this.edad == e2;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
       System.out.println(p1.sonLaMismaPersona(p2));
    }


}