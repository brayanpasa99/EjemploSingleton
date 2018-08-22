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
    private final String nombre = "Cajero 1";
    private final String caja = "10";
    private String nombrecliente;
    private CajeroSingleton(){}
    
    public static CajeroSingleton getInstance(){
        
        if(cajero == null){
            
            cajero = new CajeroSingleton();
            
        } 
        
        return cajero;
        
    }
    
    public String getNombre(){
        
        return nombre;
    }
    
    public String getCaja(){
        
        return caja;
    }
    
    public void setNombreCliente(String nombrecliente){
        
        this.nombrecliente = nombrecliente;
    }
    
    public String getNombreCliente(){
        
        return nombrecliente;
    }

}
