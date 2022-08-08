public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public boolean AñoValido(){
        return this.año > 0;
    }

    public boolean mesValido(){
        return this.mes > 0 && this.mes < 13;
    }

    public boolean añoEsBisiesto(){
        if(this.año % 400 == 0) return true; //para que un año sea bisiesto tiene que ser divisible por 400
        return false;
    }

    public boolean terminaEn31(){
        if(this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12)
           return true;
        return false;
    }

    public boolean diaValido(){
        if(terminaEn31()) return this.dia <= 31 && this.dia > 0;
        else if(!terminaEn31() && this.mes != 2) return this.dia <= 30 && this.dia > 0;
        else if (this.mes == 2) {
            if (añoEsBisiesto()) return this.dia <= 29 && this.dia > 0;
            else return this.dia <= 28 && this.dia > 0;
        }
        return false;
    }
    public boolean fechaValida(){
        if(diaValido() && mesValido() && AñoValido()) return true;
        return false;
    }

    public boolean tieneQueCambiarDeMes(int diaTerminacionMes){
        if (this.dia < diaTerminacionMes) return false;
        else {
            this.dia = 1;
            return true;
        }
    }
    public String fechaSiguiente(){
        String fecha;
        int dia = 0, mes = 0, año;
        if (terminaEn31()){
            if (tieneQueCambiarDeMes(31)){
                mes = this.mes + 1;
            } else dia = this.dia + 1;
        }
        else if (!terminaEn31() && this.mes != 2){
            if (tieneQueCambiarDeMes(30)){
                mes = this.mes + 1;
            } else dia = this.dia + 1;
        }
        else if (this.mes == 2){
            if (añoEsBisiesto()){
                if (tieneQueCambiarDeMes(29)) {
                    mes = this.mes + 1;
                } else {
                    dia = this.dia + 1;
                }

            } else{
                if (tieneQueCambiarDeMes(28)){
                    mes = this.mes + 1;
                } else dia = this.dia+ 1;
            }
        }

        if(mes == 0) mes = this.mes;
        if (dia == 0) dia = 1;
        año = this.año;
        this.setDia(dia);
        this.setMes(mes);
        this.setAño(año);
        fecha = dia + "-" + mes + "-" + año;
        return fecha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
