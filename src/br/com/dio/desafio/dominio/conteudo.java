package br.com.dio.desafio.dominio;

public abstract class conteudo {

    protected static final double XP_PADRAO = 10d;

private String tituolo;
private String descricao;

public abstract double calcularXp();

    public String getTituolo() {
        return tituolo;
    }

    public void setTituolo(String tituolo) {
        this.tituolo = tituolo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
