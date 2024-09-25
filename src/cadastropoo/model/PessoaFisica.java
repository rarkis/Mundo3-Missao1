/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropoo.model;

/**
 *
 * @author Alison
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private int idade;
    
    public PessoaFisica(){
        super();
        this.cpf = "";
        this.idade = 0;
    }
    public PessoaFisica(int id, String nome, String cpf, int idade){
        super(id, nome);
        this.cpf = cpf;
        this.idade = idade;
    }
    
    @Override public void exibir(){
        super.exibir();
        System.out.println("cpf: "+this.cpf);
        System.out.println("Idade: " + this.idade);
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
}
