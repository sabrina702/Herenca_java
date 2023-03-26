/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author tulio
 */
public class Conta {

    int numero;// atributos ou variáveis de instância
    protected double saldo;
    private double limite;
    Cliente objCliente = new Cliente();
    Cliente objCliente2;
    
    public double getSaldo(){
        return this.saldo;
        
    }
    
    public void deposita(double saldo){ // método
        this.saldo = this.saldo +saldo;
        System.out.println("Saldo pós deposito: "+saldo);
        //System.out.println("Deposito Realizado para: "+objCliente.getNome());
        
    }
    
    public boolean saca(double saldo){ // método
        if(this.saldo>=saldo){
         this.saldo = this.saldo -saldo; 
         return true;
        }else{
            System.out.println("Saldo insuficiente");
         return false;   
        }
        
    }
    
    public boolean transfere(Conta destino, double saldo){
        if(this.saca(saldo)==true){
            destino.deposita(saldo);
            return true;
    }else{
            return false;
        }
    }
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
    

 
