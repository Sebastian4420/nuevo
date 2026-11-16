public class Automovil extends Vehiculo{
    private boolean cubierto;

    public Automovil(String placa, String propietario, double horasEstacionado, boolean cubierto) {
        super(placa, propietario, horasEstacionado);
        this.cubierto = cubierto;
    }

    public boolean isCubierto() {
        return cubierto;
    }

    public void setCubierto(boolean cubierto) {
        this.cubierto = cubierto;
    }

    @Override
    public int horasFacturables() {
        return super.horasFacturables();
    }

    @Override
    public double calcularTarifa() {
        return (super.calcularTarifa())+(cubierto ? 2.00 : 0);
    }

    @Override
    public String mostrarInformacion() {
        String informacion = super.mostrarInformacion();
        String tipoCubierto;
        if(cubierto){
            tipoCubierto = "SI";
        }else{
            tipoCubierto = "N0";
        }
        return informacion+"| Automovil | Cubierto: "+tipoCubierto;
    }
}
