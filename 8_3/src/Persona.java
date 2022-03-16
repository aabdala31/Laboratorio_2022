public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona() {
        this.nombre= "Carlos";
        this.edad= 11;
        this.dni= 123456789;
        this.telefono= 1134567743;
        this.direccion= "Av. Constituyentes 2";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad= 11;
        this.dni= 123456789;
        this.telefono= 1134567743;
        this.direccion= "Av. Constituyentes 2";
    }

    public Persona(String nombre, int edad, int dni, int telefono, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public boolean esMayorDeEdad() {
        return this.edad > 18;
    }

    public boolean sonLaMismaPersona(int dni) {
        return this.dni == dni;
    }

    public boolean tienenLaMismaEdad(int edad) {
        return this.edad == edad;
    }


}
