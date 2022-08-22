package br.edu.ifsul.bcc.lpoo.cv.model;

public class Fornecedor extends Pessoa {
    private String cnpj;
    private String ie;

    public Fornecedor(){

    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
