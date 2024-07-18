package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static double XP_PADRAO = 10d; //CONSTATANTE
    //Atributos
    private String titulo;
    private String descricao;

    public abstract double cacularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
