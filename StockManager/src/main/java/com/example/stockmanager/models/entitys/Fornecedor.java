package com.example.stockmanager.models.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "fornecedore")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "telefone",nullable = false)
    private String telefone;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "endereco",nullable = false)
    private String endereco;
    @Column(name = "cnpj",nullable = false)
    private String cnpj;
    @Column(name = "data_criacao",nullable = false)
    private String data_criacao;
}



/*
    id
    nome
    telefone
    email
    endereco
    cnpj
    data_criacao
 */