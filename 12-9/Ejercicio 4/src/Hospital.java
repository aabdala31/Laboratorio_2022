import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Hospital {
    private HashSet<Medico> medicos;
    private HashSet<Empleado> empleados;
    private HashSet<Paciente> pacientes;

    public void registroMedico(Medico medico){
        this.medicos.add(medico);
    }

    public void registroEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void registroPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }

    public void crearCitasMedicas(int codigoMedico, Paciente paciente, LocalDateTime fecha_cita){
        boolean estaTurnoOcupado = false;
        for(Medico medico_aux : this.medicos){
            if (medico_aux.getCodigo() == codigoMedico){
                for (LocalDateTime fechas_ocupadas: medico_aux.getCitas_por_dia().keySet()){
                    if(fechas_ocupadas.equals(fecha_cita)){
                        System.out.println("No se puede crear cita, turno ocupado");
                        estaTurnoOcupado = true;
                    }
                }
                if(!estaTurnoOcupado){
                    medico_aux.getCitas_por_dia().put(fecha_cita, paciente);
                    System.out.println("Se creo el turno, recuerde que es en la fecha: " + fecha_cita);
                }
            }
        }
    }

    /*
        el 3 me supero perdon:)
    */

    public void DatosPacientesMedico(int codigo){
        for (Medico aux: this.medicos){
            if(aux.getCodigo() == codigo){
                for(LocalDateTime aux_fecha : aux.getCitas_por_dia().keySet()){
                    Paciente pacientea_aux = aux.getCitas_por_dia().get(aux_fecha);
                    System.out.println("Nombre: " + pacientea_aux.getNombre() + "Apellido: " + pacientea_aux.getApellido());
                }
            }
        }
    }
}
