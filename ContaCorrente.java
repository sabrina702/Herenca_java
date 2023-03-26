/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Lenovo
 */
public class ContaCorrente extends Conta {
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa * 2);
    }
    @Override
    public void deposita(double saldo){ // método
        this.saldo = (this.saldo +saldo)-1.0;
        System.out.println("Saldo pós deposito: "+saldo);
        
    }
}
