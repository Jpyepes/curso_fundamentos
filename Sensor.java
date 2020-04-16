public class Sensor
{
    //Atributos de clase
    public static Sensor[] sensores = new Sensor[8];
    public static int posAnadir = 0, tamano = 8;//,sensoresTemp=0;
    // public static Sensor [] sensor = new Sensor [8];

    //Atributos de instancia
    private String tipo; 
    private double valor;

    //Constructores
    public Sensor(){
        this("",0);
    }

    public Sensor(String t, double v){
        this.valor = v;
        this.tipo = t;
        sensores [posAnadir]= this;
        posAnadir++;
    }

    //Metodos
    public String getTipo(){
        return this.tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public void setValor(double v){
        this.valor = v;
    }

    public String toString(){
        return " ( Tipo: "+getTipo()+", Valor: "+getValor()+" ) ";
    }

    public static String toStringSensores(){
        String  cadena =" [ ";
        for(int i = 0; i< Sensor.posAnadir; i++){
            cadena=cadena+"Sensor "+(i+1)+":"+sensores[i].toString();
        }
        return cadena+" ] ";
    }

    public static int cantidadSensores(){
        return posAnadir;
    }

    public static String toStringSensoresTemp(){
        String texto = " [ ";
        for (int i = 0; i < Sensor.posAnadir; i++){
            if (sensores[i].getTipo().equals("temperatura")){

                texto = texto+ "Sensor "+(i+1)+": "+sensores[i].toString();  

            }
        }
        texto = texto+" ] ";
        return texto;
    }

    public static Sensor[] caso666(){

        //contando cuantos sensores con tipo temperatura hay
        int t=0;
        for (int i = 0; i < Sensor.posAnadir; i++){
            if (sensores[i].getTipo().equals("temperatura")){
                t++;
            }
        }

        //creando arreglo de sensores de tipo temperatura
        Sensor[] sensoresTemp=new Sensor[t]; 

        //Guardando en sensoresTemp los sensores con tipo temperatura
        int l=0;
        for (int i = 0; i < Sensor.posAnadir; i++){
            if (sensores[i].getTipo().equals("temperatura")){
                sensoresTemp[l]=sensores[i];
                l++;
            }
        }
        
        //Ordenandolos por valor
        int n=sensoresTemp.length;
        int posMenor;
        Sensor temp;

        for (int i = 0; i < n-1; i++){
            posMenor=i;

            for (int j = i+1; j < n; j++){
                if (sensoresTemp[j].getValor()< sensoresTemp[posMenor].getValor())
                {

                    posMenor=j;
                }

            }
            temp = sensoresTemp[i];
            sensoresTemp[i]=sensoresTemp[posMenor];
            sensoresTemp[posMenor]= temp;
        }

        return sensoresTemp; 
    }
}