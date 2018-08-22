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
public class Clientes {
    
    public static void main(String[] args){
        
        CajeroSingleton cliente = CajeroSingleton.getInstance();
        cliente.setNombreCliente("Cliente 1");
        System.out.println("El cliente: "+cliente.getNombreCliente()+"\nEstá siendo atendido por: "+
                cliente.getNombre()+"\nEn la caja: "+cliente.getCaja());
        
        CajeroSingleton cliente1 = CajeroSingleton.getInstance();
        cliente1.setNombreCliente("Cliente 2");
        System.out.println("El cliente: "+cliente1.getNombreCliente()+"\nEstá siendo atendido por: "+
                cliente1.getNombre()+"\nEn la caja: "+cliente1.getCaja());
            
        CajeroSingleton cliente2 = CajeroSingleton.getInstance();
        cliente2.setNombreCliente("Cliente 3");
        System.out.println("El cliente: "+cliente2.getNombreCliente()+"\nEstá siendo atendido por: "+
                cliente2.getNombre()+"\nEn la caja: "+cliente2.getCaja());
        
        CajeroSingleton cliente3 = CajeroSingleton.getInstance();
        cliente3.setNombreCliente("Cliente 4");
        System.out.println("El cliente: "+cliente3.getNombreCliente()+"\nEstá siendo atendido por: "+
                cliente3.getNombre()+"\nEn la caja: "+cliente3.getCaja());
        
    }
    
}
