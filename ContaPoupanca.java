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
public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa * 3);
    }
}
