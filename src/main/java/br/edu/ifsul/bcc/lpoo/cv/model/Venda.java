package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;
import java.util.List;

public class Venda {
    private Integer id;
    private String observacao;
    private Float valor_total;
    private Calendar data;
    private Pagamento pagamento;
    private Funcionario funcionario;
    private Cliente cliente;
    private List<Consulta> consultas;
    private List<Produto> produtos;

    public Venda(){

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Float getValor_total() {
        return valor_total;
    }
    public void setValor_total(Float valor_total) {
        this.valor_total = valor_total;
    }

    public Calendar getData() {
        return data;
    }
    public void setData(Calendar data) {
        this.data = data;
    } 

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
