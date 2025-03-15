package com.example.stockmanager.models.entitys;

import com.example.stockmanager.models.entitys.Produto;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "lotes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(name = "fk_lote_produto"))
    private Produto produto;

    @Column(nullable = false)
    private String codigoLote;

    @Column(nullable = false)
    private Integer quantidade;

    private LocalDateTime dataValidade;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataEntrada = LocalDateTime.now();
}
