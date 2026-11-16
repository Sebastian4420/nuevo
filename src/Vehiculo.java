import javax.tools.StandardJavaFileManager;

public class Vehiculo {
    private String placa;
    private String propietario;
    double horasEstacionado;

    public Vehiculo(String placa, String propietario, double horasEstacionado) {
        this.placa = placa;
        this.propietario = propietario;
        setHorasEstacionado(horasEstacionado);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getHorasEstacionado() {
        return horasEstacionado;
    }

    public void setHorasEstacionado(double horasEstacionado) {
        this.horasEstacionado = horasEstacionado;
    }

    public int horasFacturables(){
        int completas = (int) horasEstacionado;
        if(horasEstacionado>completas){
            completas = completas + 1;
        }
        return completas;
    }
    public double calcularTarifa(){
        return horasFacturables()*1.50;
    }
    public String mostrarInformacion(){
        return "PLACA: "+placa+" | PROPIETARIO: "+propietario+" | HORAS ESTACIONADO: "+horasEstacionado+ " | HORAS FACTURABLES: "+horasFacturables()+" | TARIFA: "+calcularTarifa()+"$";
    }





}
