/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

/**
 *
 * @author adrie
 */
public class ContaPoupanca extends Conta{
    private float taxa;
    private int variacao;
    private Conta conta;
    
    public ContaPoupanca(){
        this.taxa = taxa;
        this.conta = new Conta();
    }
    
    public ContaPoupanca(int agencia, int num, double saldo, Pessoa dono, float taxa, int variacao){
        super(agencia, num, saldo, dono);
        this.conta = conta;
        this.variacao = variacao;
        this.taxa = taxa;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public void imprimir(){
        System.out.println("CONTA POUPANÇA");
        super.imprimir();
        System.out.println("Variação: "+variacao+"\nTaxa: "+taxa+"%");

    }
    
    
}
