package com.example.stockmanager.models.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidosrepo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PedidosRepo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "produto",nullable = false)
    private int produto;
    @Column(name = "fornecedor",nullable = false)
    private int fornecedor;
    @Column(name="quantidade",nullable = false)
    private int quantidade;
    @Column(name="status",nullable = false)
    private String status;
    @Column(name="datapedido")
    private LocalDateTime datapedido;
    @Column(name="dataentrega")
    private LocalDateTime dataentrega;
    @Column(name="usuario",nullable = false)
    private int usuario;

}
