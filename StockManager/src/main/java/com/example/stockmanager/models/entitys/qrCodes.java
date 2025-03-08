package com.example.stockmanager.models.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "qrcodes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class qrCodes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "produto",nullable = false)
    private int produto;
    @Column(name = "codigoqr",nullable = false)
    private String codigoqr;
}
