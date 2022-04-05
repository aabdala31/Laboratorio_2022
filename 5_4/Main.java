import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Hijo hijo1 = new Hijo();
        ArrayList<Hijo> hijos = new ArrayList();
        hijos.add(hijo1);

        Madre madre1 = new Madre(hijos);
        madre1.hijosMenores();
    }
}
