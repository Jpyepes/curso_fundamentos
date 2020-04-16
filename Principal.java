import java.util.Scanner;
public class Principal
{
    public static void main (String [] args){
        Principal.mostrarMenu();
    }

    public static void mostrarMenu() {

        Scanner scan = new Scanner (System.in);
        int n=1;

        while (n==1) {
            System.out.println ("Ingrese un numero del 0 al 8 ó 666: ");
            int num = scan.nextInt();
            switch (num){

                case 0:
                //finaliza la ejecucion del programa 
                n=0;
                break;

                case 1:
                //se crea una instancia de vehiculo
                if(Vehiculo.posAnadir<10){
                    System.out.println ("Datos del vehiculo "+(Vehiculo.posAnadir+1)+": ");
                    System.out.println ("Ingrese el modelo: ");
                    int mo = scan.nextInt();
                    System.out.println ("Ingrese la marca: ");
                    String ma = scan.next();
                    System.out.println ("Ingrese color: ");
                    String co = scan.next();
                    System.out.println ("Ingrese el valor comercial: ");
                    double va = scan.nextDouble();

                    Vehiculo vehiculoNuevo = new Vehiculo (mo,ma,va,co);

                }else {
                    System.out.println ("Error base de datos llena");
                }
                System.out.println ("");
                break;

                case 2:
                //mostrar la información de todos los vehículos almacenados hasta el momento 
                System.out.println ("Información de todos los vehiculos : ");
                System.out.println (Vehiculo.toStringVehiculos());
                System.out.println ("");
                break;

                case 3:
                //mostrar la cantidad de vehículos creados hasta el momento 
                System.out.println ("Hasta el momento se han creado "+Vehiculo.cantidadVehiculos()+" vehiculos");
                System.out.println ("");
                break;

                case 4:
                //mostrar la información de todos los vehículos que tengan color “verde” 
                System.out.println ("Información de todos los vehiculos de color verde : ");
                System.out.println (Vehiculo.toStringVehiculosVerdes());
                System.out.println ("");
                break;

                case 5:
                //se crea una instancia de sensor
                if(Sensor.posAnadir < 10){
                    System.out.println ("Datos del sensor "+(Sensor.posAnadir+1)+": ");
                    System.out.println ("Ingrese el tipo: ");
                    String t = scan.next();
                    System.out.println ("Ingrese el valor:");
                    double v = scan.nextDouble();

                    Sensor sensorNuevo = new Sensor (t,v);
                }else {
                    System.out.println ("Error base de datos llena");
                }
                System.out.println ("");
                break;

                case 6:
                //mostrar la información de todos los sensores almacenados hasta el momento 
                System.out.println ("Información de todos los sensores : ");   
                System.out.println (Sensor.toStringSensores());
                System.out.println ("");
                break;

                case 7:
                //mostrar la cantidad de sensores creados hasta el momento 
                System.out.println ("Hasta el momento se han creado "+Sensor.cantidadSensores()+" sensores");
                System.out.println ("");
                break;

                case 8:
                //mostrar la información de todos los sensores de tipo “temperatura” 
                System.out.println ("Información de todos los sensores de tipo tempeartura: ");
                System.out.println (Sensor.toStringSensoresTemp());
                System.out.println ("");
                break;

                case 666:
                //mostrar los sensores tipo temperatura ordenados por valor
                System.out.println ("Información de todos los sensores de tipo tempeartura ordenados por valor: ");

                //recogiendo arreglo de sensores tempeartura ordenados
                Sensor[] sensoresTempOrden=Sensor.caso666();

                //imprimiendo arreglo
                String  cadena =" [ ";

                for(int i = 0; i<sensoresTempOrden.length;i++){
                    cadena=cadena+"Sensor "+(i+1)+":"+sensoresTempOrden[i].toString();
                }
                System.out.println (cadena+" ] ");
                System.out.println ("");
                break;
            }

        }
        System.out.println ("Fin del programa"); 
    }

}
