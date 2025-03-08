package com.example.stockmanager.models.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "historicoestoque")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoricoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "produto",nullable = false)
    private int produto;
    @Column(name = "usuario",nullable = false)
    private int usuario;
    @Column(name = "acao",nullable = false)
    private String acao;
    @Column(name ="data")
    private LocalDateTime data;
}
