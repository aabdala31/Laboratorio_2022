import java.util.HashSet;

public class Sistema {
    private HashSet<Grupo_sensores> sensores;

    public Sistema(){
        this.sensores = new HashSet<>();
    }

    public void disparar_alarma(){
        for (Grupo_sensores sensores1: this.sensores) {
            sensores1.bucleContinuo();
        }
    }
}
