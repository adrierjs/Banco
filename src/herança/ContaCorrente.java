/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

/**
 *
 * @author adrie
 */
public class ContaCorrente extends Conta {
    private float limite;

    public ContaCorrente() {
        this.limite = 0;
    }

    public ContaCorrente(int agencia,int num, double saldo, Pessoa dono, float limite) {
        super(agencia, num, saldo, dono);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
    public void imprimir(){
        System.out.println("CONTA CORRENTE");
        super.imprimir();
        System.out.println("Limite: "+this.limite);
    }
    
}
