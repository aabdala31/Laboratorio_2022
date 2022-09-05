public class Main {

    public static void tryCatch(String nombre){
        try {
            System.out.println("El nombre es :" + nombre.length());
        }
        catch (NullPointerException exception){
            System.out.println("No se puede hacer el nombre.length() porque este es null");
        }
    }

    public static void throwE(String nombre){
        try {
            if (nombre == null) throw new NullPointerException("xd");
        }
        catch (NullPointerException exception){
            System.err.println(exception);
        }
    }

    public static int nombreNull (String nombre) throws Exception{
        return nombre.length();
    }

    public static void throwsE (String nombre){
        try {
            nombreNull(nombre);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void ExcepcionesP(String nombre) throws ClaseExcepcion{
        try {
            if (nombre == null) throw new ClaseExcepcion("No se pudo reina");
        }
        catch (Exception e){
            System.err.println(e);
        }
    }


    public static void main(String[] args) throws ClaseExcepcion {
        String nombre = null;

        //tryCatch(nombre);
        //throwE(nombre);
        //throwsE(nombre);
        ExcepcionesP(nombre);
        System.out.println("Abdala - Aversa");
    }


}