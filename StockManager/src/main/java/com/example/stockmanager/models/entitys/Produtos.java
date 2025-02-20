package com.example.stockmanager.models.entitys;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "codigoBarras")
    private String codigoBarras;
    @Column(name = "quantidadeEstoque",nullable = false)
    private int quantidadeEstoque;
    @Column(name = "precoCusto",nullable = false)
    private double precoCusto;
    @Column(name = "precoVenda",nullable = false)
    private double precoVenda;
    @Column(name = "fornecedorId",nullable = false)
    private double fornecedorId;
    @Column(name = "data_criacao")
    private LocalDateTime data_criacao;
}