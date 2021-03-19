/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */
public abstract class pessoa {
    public String nome;

    @Override
    public String toString() {
        return "pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + '}';
    }
    public static int cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  int getCpf() {
        return cpf ;
     
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int idade;
}
