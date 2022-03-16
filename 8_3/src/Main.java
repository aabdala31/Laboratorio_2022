public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlitos", 17, 123456789, 1133334444, "Av Constituyentes 1");
        Persona p2 = new Persona("Juan", 11, 123456779, 1122334455, "Calos Bilardo 232");
        Persona p3 = new Persona("Marcelo", 75, 987654321, 112345678, "Manito 2234");

        p1.setEdad(p1.getEdad()*2);
        p2.setTelefono(1164051621);
        System.out.printf("Persona3: { %s, %d, %d, %d, %s }%n", p3.getNombre(), p3.getEdad(), p3.getDni(), p3.getTelefono(), p3.getDireccion());
    }
}
