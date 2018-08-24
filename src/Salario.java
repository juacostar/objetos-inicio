/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Salario {
    public int numero;
    public String propietario;
    public double saldo;
    public String grtPropietario(){
        return null;
    }
    
    public void setPropietario(){
        
    }
    
    public void consignar(double valor){
        saldo= saldo+valor;
    }
}
