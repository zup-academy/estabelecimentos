package com.zupedu.estabelecimentos.unidades;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UnidadeRequest {

    @NotBlank
    @NotNull
    private String nome;

    private String telefone;

    private String documento;

    private String email;

    private Endereco endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Unidade getUnidade(){
        return new Unidade(this.nome, this.telefone,
                this.documento, this.email, this.endereco);
    }
}
