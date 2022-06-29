
package proyectoprimerbimestre;

public class Usuario {
    private String Nombre;
    private String Apellido;
    private int cantidadCuentas; //Aleatorio entre 1 y 4 cuentas
    private String Cuentas[];
    public float Saldos[];
    private String TiposDeCuenta[];
    
    public Usuario(){
        String apellidos[] = {"Rojas", "Cajas", "Rodas", "Perez", "Guerra", "Genes"};
        this.Apellido=apellidos[(int)Math.round(Math.random()*5)]; //inicializa el apellido
        String nombres[] = {"Andres", "Brandon", "Jose", "Raul", "Alex", "Marco"};
        this.Nombre=nombres[(int)Math.round(Math.random()*5)];
        this.cantidadCuentas = (int)Math.round(Math.random()*3+1);
        this.Cuentas = new String[this.cantidadCuentas];
        for(int i=0; i<this.cantidadCuentas; i++){
            this.Cuentas[i]="";
            for(int j=0; j<10; j++){
                this.Cuentas[i]=this.Cuentas[i]+String.valueOf((int)Math.round(Math.random()*8+1));
            }
        }
        this.Saldos = new float[this.cantidadCuentas];
        for(int i=0; i<this.cantidadCuentas; i++){
            this.Saldos[i] = (float)(1+(Math.random()*1000));
        }
        this.TiposDeCuenta = new String[this.cantidadCuentas];
        for(int i=0; i<this.cantidadCuentas; i++){
            int j = (int)(Math.round(Math.random()));
            if(j==0){
                this.TiposDeCuenta[i]="Ahorros";
            }else{
                this.TiposDeCuenta[i]="Corriente";
            }
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getCantidadCuentas() {
        return cantidadCuentas;
    }

    public String getNumeroDeCuenta(int indice) {
        return Cuentas[indice];
    }
    
    public float getSaldo(int indice) {
        return Saldos[indice];
    }
    
    public String getTipoDeCuenta(int indice) {
        return TiposDeCuenta[indice];
    }

    public void setSaldos(float[] Saldos) {
        this.Saldos = Saldos;
    }
    
}
