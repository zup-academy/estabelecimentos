package com.zupedu.estabelecimentos.unidades;

public class UnidadeResponse {

    private Long id;

    private String nome;

    private String telefone;

    private String documento;

    private String email;

    private Endereco endereco;

    public UnidadeResponse(Long id, String nome,
                           String telefone, String documento,
                           String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.documento = documento;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public static UnidadeResponse from(Unidade unidade){
        return new UnidadeResponse(unidade.getId(), unidade.getNome(),
                unidade.getTelefone(), unidade.getDocumento(),
                unidade.getEmail(), unidade.getEndereco());
    }
}
