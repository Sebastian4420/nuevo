import java.util.*;

public class DemoConversiones {
    public static void main(String[] args){
        /**
        int entero= 5;
        double implicito= entero;
        double decimal = 3.75;
        int truncado = (int) decimal;
        long redondeado = Math.round(decimal);
        double techo = Math.ceil(decimal);
        int opcion = Integer.parseInt("2");
        double horas = Double.parseDouble("3.75");
        String ticket = "PK-"+String.valueOf(150);
        System.out.println("Casting implicito int -> double: "+implicito);
        System.out.println("Casting explicito double -> int: "+ truncado);
        System.out.println("Math.round: "+redondeado);
        System.out.println("Math.ceil: "+ techo);
        System.out.println("Parsing int: "+opcion);
        System.out.println("Parsing double: "+horas);
        System.out.println("Numero a texto: "+ticket);
         **/
        Scanner sc = new Scanner(System.in);

        int opcion;
        do{
            System.out.println("SISTEMA PARQUEADERO");
            System.out.println("1.- VEHICULO BASE");
            System.out.println("2.- AUTOMOVIL CUBIERTO");
            System.out.println("3.- AUTOMOVIL VIP");
            System.out.println("4.- MOTOCICLETA");
            System.out.println("5- SALIR");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            if(opcion ==1){
                System.out.println("PLACA: ");
                String placa = sc.nextLine();
                System.out.println("NOMBRE: ");
                String nombre = sc.nextLine();
                System.out.println("HORAS ESTACIONADO: ");
                double horas = sc.nextDouble();
                Vehiculo vehiculo = new Vehiculo(placa, nombre, horas);
                vehiculo.horasFacturables();
                vehiculo.calcularTarifa();
                System.out.println(vehiculo.mostrarInformacion());

            }else if(opcion == 2){
                System.out.println("PLACA: ");
                String placa = sc.nextLine();
                System.out.println("NOMBRE: ");
                String nombre = sc.nextLine();
                System.out.println("HORAS ESTACIONADO: ");
                double horas = sc.nextDouble();
                sc.nextLine();
                System.out.println("¿ES CUBIERTO?");
                String respuesta = sc.nextLine();
                boolean cubierto = respuesta.trim().toLowerCase().equals("si");
                Automovil automovil = new Automovil(placa, nombre, horas, cubierto);
                automovil.horasFacturables();
                automovil.calcularTarifa();
                System.out.println(automovil.mostrarInformacion());
            }else if(opcion ==3){

            }
        }while (opcion!=5);
        sc.close();

    }
}
