package peaje;


public class Peaje {

    
    private String placa, hora, tipoV;
    private double valor=0;
    
    public Peaje(String placa, String hora, double valor, String tipoV){
        this.placa = placa;
        this.hora = hora;
        this.valor = valor;
        this.tipoV = tipoV;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getHora(){
        return hora;
    }
    
    public double getValor(){
        return valor;
    }
    
    public String getTipoV(){
        return tipoV;
    }
    
}
