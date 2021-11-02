/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clases;

/**
 *
 * @author DIA
 */
public class voucher2 {
    /*atributos*/
    private String nombre;
    private String operacion;
    private int cantidad;
    
    /*Constructores*/
    public voucher2() {
        
    }
    public voucher2(String nombre, String operacion, int cantidad ) {
        this.nombre=nombre;
        this.operacion=operacion;
        this.cantidad=cantidad;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the operacion
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   
    
    /*Operaciones*/
    public double calculo() {
        if (getOperacion().equals("Retirar")) {
            return 2000-cantidad;
        } else if (getOperacion().equals("Depositar")) {
            return 2000+cantidad;
        } else {
            return 0;
        }
 
    }

    

    
    
}

