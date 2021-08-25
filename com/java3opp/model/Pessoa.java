package com.java3opp.model;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String id;
    private Double peso;
    private Double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Pessoa(String nome, Integer idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, Integer idade, String id, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public Double cacularIMC() {
        double imc = this.peso/(Math.pow(this.altura,2));

        if(imc<20){
            return -1d;
        }else if(imc>=20 && imc<=25){
            return 0d;
        }else{
            return 1d;
        }
    }

    public Boolean eMaiorDeIdade(){
        double maiorIdade = this.idade;
        if(maiorIdade>18){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                    "nome='" + nome + '\'' +
                    ", idade='" + idade + '\'' +
                    ", id='" + id + '\'' +
                    ", peso='" + peso + '\'' +
                    ", altura='" + altura + '\'' +
                '}';
    }

}
