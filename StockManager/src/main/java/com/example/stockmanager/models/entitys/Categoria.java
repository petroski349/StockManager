package com.example.stockmanager.models.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "descricao",nullable = false)
    private String descricao;
}
