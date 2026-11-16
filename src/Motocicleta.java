public class Motocicleta extends Vehiculo{
    private int cilindraje;

    public Motocicleta(String placa, String propietario, double horasEstacionado, int cilindraje) {
        super(placa, propietario, horasEstacionado);
        setCilindraje(cilindraje);
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        if(cilindraje>0){
            this.cilindraje = cilindraje;
        }
    }

    @Override
    public double calcularTarifa() {
        return horasFacturables()*0.75;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()+" | MOTOCICLETA | CILINDRAJE: "+cilindraje+" cc";
    }

}
