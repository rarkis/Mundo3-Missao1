/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropoo.model;

/**
 *
 * @author Alison
 */
import java.util.ArrayList;
import java.io.*;

public class PessoaJuridicaRepo {
    private ArrayList<PessoaFisica> pessoas;
    
    public PessoaJuridicaRepo(){
        this.pessoas = new ArrayList<>();
    }
    
    public void inserir(PessoaFisica pessoa){
        this.pessoas.add(pessoa);
    }
    public void alterar(PessoaFisica pessoa){
        int tagetId = pessoa.getId();
        int targetIndex = this.pessoas.indexOf(this.obter(tagetId));
        this.pessoas.set(targetIndex,pessoa);
    }
    
    public void excluir(int id){
        this.pessoas.remove(this.obter(id));
    }
    public PessoaFisica obter(int id){        
        return this.pessoas.stream().filter(pessoa -> pessoa.getId() ==  id ).
                findFirst().orElse(null);
    }
    public ArrayList<PessoaFisica> obterTodos(){
        return this.pessoas;
    }
    public void persistir(String nomeArquivo)throws IOException{
        try (ObjectOutputStream outputStream 
                = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(this.pessoas);
        }
    }
    public void recuperar(String nomeArquivo)throws IOException, ClassNotFoundException{
        try (ObjectInputStream inputStream 
                = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            this.pessoas = (ArrayList<PessoaFisica>) inputStream.readObject();
        }
    }
}
