/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropoo.model;

/**
 *
 * @author Alison
 */
import java.io.Serializable;
        
public class Pessoa implements Serializable {
    protected int id;
    protected String nome;
    
    public Pessoa(){
        this.id = 0;
        this.nome = "";
    }
    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    
    public void exibir(){
        System.out.println("ID:"+this.id);
        System.out.println("Nome:"+this.nome);
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
