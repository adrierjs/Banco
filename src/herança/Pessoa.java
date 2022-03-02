/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

import java.util.List;

/**
 *
 * @author adrie
 */
public class Pessoa {
    private String nome;
    private int identidade;
    private List<Conta> contas;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, int identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }
    
    
    public List<Conta> getContas(){
        return contas;
    }
    
    public void setContas(List<Conta> contas){
        this.contas = contas;
    }

    @Override
    public String toString() {
        return"Nome: "+nome + "\nIdentidade: "+ identidade;
    }
    
    
}
