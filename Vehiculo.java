
public class Vehiculo
{
    //Atributos de clase
    public static Vehiculo[] vehiculos=new Vehiculo[10];
    public static int tamano=10;
    public static int posAnadir=0;

    //Atributos de instancia
    private int modelo;
    private String marca,color;
    private double valorComercial;

    //Constructores
    public Vehiculo(){
        this(0,"",0,"");
    }

    public Vehiculo(int mo, String ma, double va){
        this(mo,ma,va,"verde");

    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo=mo;
        this.marca=ma;
        this.valorComercial=va;
        this.color=co; 

        vehiculos[posAnadir]=this;
        posAnadir++;

    }

    //Metodos

    public void setModelo(int mo){
        this.modelo=mo;
    }

    public int getModelo(){
        return this.modelo;
    }

    public void setMarca(String ma){
        this.marca=ma;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setColor(String co){
        this.color=co;
    }

    public String getColor(){
        return this.color;
    }

    public void setValorComercial(double va){
        this.valorComercial=va;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public String toString(){
        return " ( Modelo: "+getModelo()+", Marca: "+getMarca()+", Valor comercial: "+getValorComercial()+", Color: "+getColor()+" ) ";

    }

    public static String toStringVehiculos(){
        // int m=Vehiculo.posAnadir;
        String cadena=" [ ";

        for(int i = 0; i < Vehiculo.posAnadir; i++){

            cadena= cadena+"Vehiculo "+(i+1)+":"+vehiculos[i].toString();

        }

        cadena=cadena+" ] ";
        return cadena;
    }

    public static int cantidadVehiculos(){
        return posAnadir;
    }

    public static String toStringVehiculosVerdes(){
        String texto = " [ ";
        for (int i = 0; i < Vehiculo.posAnadir; i++){
            if (vehiculos[i].getColor().equals("verde")){
                
            texto= texto+"Vehiculo "+(i+1)+": "+vehiculos[i].toString(); 
            
            }
        }
        texto = texto+" ] ";
        return texto;
    }
    
}

