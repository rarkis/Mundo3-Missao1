/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropoo.model;

/**
 *
 * @author Alison
 */
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    
    public PessoaJuridica(){
        super();
        this.cnpj = "";
    }
    public PessoaJuridica(int id, String nome, String cnpj){
        super(id,nome);
        this.cnpj = cnpj;
    }
    @Override public void exibir(){
        super.exibir();
        System.out.println("CNPJ: " + this.cnpj);
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    
}
