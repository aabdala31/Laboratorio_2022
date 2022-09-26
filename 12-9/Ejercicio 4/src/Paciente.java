import java.util.HashSet;

public class Paciente extends Persona{
    private int nroHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private HashSet<String> medicamentosAlergia;

    public int getNroHistoriaClinica() {
        return nroHistoriaClinica;
    }

    public void setNroHistoriaClinica(int nroHistoriaClinica) {
        this.nroHistoriaClinica = nroHistoriaClinica;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public HashSet<String> getMedicamentosAlergia() {
        return medicamentosAlergia;
    }

    public void setMedicamentosAlergia(HashSet<String> medicamentosAlergia) {
        this.medicamentosAlergia = medicamentosAlergia;
    }
}
