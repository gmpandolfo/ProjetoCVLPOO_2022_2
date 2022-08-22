package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;

public class Agenda {
    private Integer id;
    private Calendar data_inicio;
    private Calendar data_fim;
    private String observacao;
    private Funcionario funcionario;
    private Status status;
    private TipoProduto tipoProduto;
    private Medico medico;

    public Agenda(){

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }
    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Calendar getData_fim() {
        return data_fim;
    }
    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Status getStatus() {
        return status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    
    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }
    
    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
