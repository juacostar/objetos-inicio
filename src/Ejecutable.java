/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Ejecutable {
    public static void main(String[] args){
        Salario c1= new Salario();
        c1.numero= 1234;
        c1.propietario= "Jim";
        c1.saldo= 300;
        
        System.out.println("Saldo "+ c1.saldo);
        c1.consignar(1000);
        System.out.println("Nuevo "+ c1.saldo);
    }
            
}
