package com.java3opp;

import com.java3opp.model.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Carol",10,"1234");
        Pessoa pessoa2 = new Pessoa("Cassio",40,"12345",75.0,1.82);

        // Pessoa pessoa = new Pessoa("Maria",25);
        // Exibe o erro: Não existe um construtor adequado para esse objeto
        // java: no suitable constructor found for Pessoa(java.lang.String,int)

        //Pessoa 1
        String pessoaDados1 = pessoa1.toString();
        System.out.println(pessoaDados1);
        boolean idade1 = pessoa1.eMaiorDeIdade();
        if(!idade1)
            System.out.println(pessoa1.getNome()+" não é maior de idade");
        else
            System.out.println(pessoa1.getNome()+" é maior de idade");

        //Pessoa 2
        String pessoaDados2 = pessoa2.toString();
        System.out.println(pessoaDados2);
        boolean idade2 = pessoa2.eMaiorDeIdade();
        if(!idade2)
            System.out.println(pessoa2.getNome()+" não é maior de idade");
        else
            System.out.println(pessoa2.getNome()+" é maior de idade");

        double imc = pessoa2.cacularIMC();
        if(imc == -1)
            System.out.println("Abaixo do peso");
        else if(imc == 0)
            System.out.println("Peso saudável");
        else
            System.out.println("Sobrepeso");
    }

}
