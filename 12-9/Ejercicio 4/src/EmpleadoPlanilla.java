public class EmpleadoPlanilla extends Empleado{
    private float salarioMensual;
    private int porcentajeAdicionalHorasExtra;



    public float getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public float calculoSalario() {
        float salario = this.salarioMensual + this.porcentajeAdicionalHorasExtra * getNro_horas_extra();
        return salario;
    }
}
