
package proyectoprimerbimestre;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private int fila;
    private String nombreUsuario;
    private String password;
    private String nombreCompleto;
    private ArrayList<String> cuentas;
    private ArrayList<String> tipoCuentas;
    private ArrayList<Float> saldos;
    private ArrayList<String> movimientos;
    
    
    

    public Usuario(int fila,String nombreUsuario, String password,String nombreCompleto, 
        ArrayList<String> cuentas,ArrayList<String> tipoCuentas,
        ArrayList<Float> saldos, ArrayList<String> movimientos) {
       
       this.nombreUsuario=nombreUsuario;
       this.password=password;
       this.fila=fila;
       this.nombreCompleto=nombreCompleto;
       this.cuentas=cuentas;
       this.tipoCuentas=tipoCuentas;
       this.saldos=saldos;
       this.movimientos=movimientos;
       
       movimientos.add("");
       movimientos.add("");
       movimientos.add("");
       movimientos.add("");
       
       
    }

    public int getFila() {
        return fila;
    }

    
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }


    public String getCuenta(int indice) {//
        return cuentas.get(indice);
    }
    
    public float getSaldo(int indice) {
        return saldos.get(indice);
    }
    
    public String getTipoCuentas(int indice) {
        if(tipoCuentas.get(indice).equals("0")){
            return "Ahorros";
        }else{
            return "Corriente";
        }
    }

    public void setSaldos(float Saldos, int indice) {
        this.saldos.set(indice, Saldos);
    }

    public void setMovimientos(String mov, int indice){
        this.movimientos.set(indice, mov);
    }
    
    public String getMovimientos(int indice){
        return this.movimientos.get(indice);
    }
    
    public int getCantidadCuentas(){
        return(this.cuentas.size());
    }
    
    public void addCuenta(String cuenta){
        this.cuentas.add(cuenta);
    }

    public void addTipo(String tipo){
        this.tipoCuentas.add(tipo);
    }
    
    public void addSaldo(Float saldo){
        this.saldos.add(saldo);
    }
    
    public boolean anexar(ArrayList<String> archivo,String nombreArchivo) {
        boolean r = false; 
        try {
            PrintWriter fileOut;
            fileOut = new PrintWriter(new FileWriter(nombreArchivo, false));
            for(String filaLectura:archivo){
                fileOut.println(filaLectura);
            }
            fileOut.close();
            r = true;
        } catch (IOException ex) {
            System.out.println("Error IOException" + ex.getMessage());
        }
        
        return r;   
        
    }
    
    public ArrayList<String> leerArchivo(){
        ArrayList<String> archivo = new ArrayList<>();
        try {
            Scanner lector = new Scanner(new FileReader("usuarios.txt"));
            while (lector.hasNextLine()) {
                archivo.add(lector.nextLine());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error FileNotFoundException");
        }
        return archivo;   
    }
    
    
    public String escribirFilaNueva(){
        String filaEscrita;
        filaEscrita=this.nombreUsuario+";"+this.password+";"+this.nombreCompleto;
        for(int i=0;i<getCantidadCuentas();i++){
            filaEscrita+=";"+cuentas.get(i)+";"+tipoCuentas.get(i)+";"+saldos.get(i);
        }
        return filaEscrita;
    }
    
    public ArrayList<String> sobrescribirArchivo(ArrayList<String> archivo,int fila, String mensaje){
        archivo.set(fila,mensaje);
        return archivo;
    }
    
     public ArrayList<String> leerMovimientos(){
        ArrayList<String> archivo = new ArrayList<>();
        try {
            Scanner lector = new Scanner(new FileReader("movimientos.txt"));
            while (lector.hasNextLine()) {
                archivo.add(lector.nextLine());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error FileNotFoundException");
        }
        return archivo;   
    }
    
    
}

