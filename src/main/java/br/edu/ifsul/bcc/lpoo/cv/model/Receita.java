package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.List;

public class Receita {
    private Integer id;
    private String orientacao;
    private List<Produto> produtos;
    private Consulta consulta;

    public Receita(){

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getOrientacao() {
        return orientacao;
    }
    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
