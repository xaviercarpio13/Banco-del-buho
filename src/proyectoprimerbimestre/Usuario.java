
package proyectoprimerbimestre;
import java.util.ArrayList;

public class Usuario {
 
    private String nombreCompleto;
    private ArrayList<String> cuentas;
    private ArrayList<String> tipoCuentas;
    private ArrayList<Float> saldos;
    private ArrayList<String> movimientos;
    
    

    public Usuario(String nombreCompleto, ArrayList<String> cuentas,
        ArrayList<String> tipoCuentas,ArrayList<Float> saldos,
        ArrayList<String> movimientos) {
       
       this.nombreCompleto=nombreCompleto;
       this.cuentas=cuentas;
       this.tipoCuentas=tipoCuentas;
       this.saldos=saldos;
       this.movimientos=movimientos;
    }

    
    
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

   

    public String getCuenta(int indice) {
        return cuentas.get(indice);
    }
    
    public float getSaldo(int indice) {
        return saldos.get(indice);
    }
    
    public String getTipoCuentas(int indice) {
        return tipoCuentas.get(indice);
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
    
    
}
