/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herança;

/**
 *
 * @author adrie
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa("Adrier", 223535);
       // Conta c = new Conta(2210,202020, 1000,p);
      
        
        Conta cp = new ContaPoupanca(2210,202020, 1000,p,1, 56);
        cp.depositar(1000);
        cp.imprimir();
        Conta cc = new ContaCorrente(2210,202020, 1000,p,5000);
        cc.transferir(1000, cp);
        cp.imprimir();
     
        
        
    
    }
    
}
