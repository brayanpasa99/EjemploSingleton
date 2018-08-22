/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploSingleton;

/**
 *
 * @author Brayan Alexander
 */
public class CajeroSingleton {
    
    private static CajeroSingleton cajero = null;
    private String nombrecliente, nombrecajero, caja;
    private CajeroSingleton(String nombrecajero, String caja){
        
        setNombreCajero(nombrecajero);
        setCaja(caja);
        
    }
    
    public static CajeroSingleton getInstance(String nombrecajero, String caja){
        
        if(cajero == null){
            
            cajero = new CajeroSingleton(nombrecajero, caja);
            
        } else{
            
            System.out.println("No se puede crear: "+nombrecajero+" en la caja "+caja+", porque ya está atendiendo un cajero");
        }
        
        return cajero;
        
    }
    
    public String getNombreCajero(){
        
        return nombrecajero;
    }
    
    public String getCaja(){
        
        return caja;
    }
    
    public void setNombreCliente(String nombrecliente){
        
        this.nombrecliente = nombrecliente;
    }
    
     
    public void setNombreCajero(String nombrecajero){
        
        this.nombrecajero = nombrecajero;
    }
    public String getNombreCliente(){
        
        return nombrecliente;
    }
    
    public void setCaja(String caja){
        
        this.caja = caja;
    }

}
