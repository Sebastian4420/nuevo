public class AutomovilVIP extends Automovil {

    private double descuentoPorcentaje;

    public AutomovilVIP(String placa, String propietario, double horasEstacionado, boolean cubierto, double descuentoPorcentaje) {
        super(placa, propietario, horasEstacionado, cubierto);
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    public double getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }

    public void setDescuentoPorcentaje(double descuentoPorcentaje) {
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    @Override
    public double calcularTarifa() {
        return super.calcularTarifa();
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion();
    }
}
