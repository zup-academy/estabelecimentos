package com.zupedu.estabelecimentos.unidades;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "unidade")
public class Unidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String telefone;

    private String documento;

    private String email;

    private LocalDateTime dataCriado;

    @Embedded
    private Endereco endereco;

    @Deprecated
    public Unidade() {
    }

    public Unidade(String nome,
                   String telefone, String documento,
                   String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.documento = documento;
        this.email = email;
        this.endereco = endereco;
        this.dataCriado = LocalDateTime.now();
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

}
