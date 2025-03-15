package com.example.stockmanager.models.entitys;

import jakarta.persistence.*;
import com.example.stockmanager.models.entitys.Produto;
import com.example.stockmanager.models.entitys.Usuarios;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "movimentacoes_estoque")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(name = "fk_movimentacao_produto"))
    private Produto produto;

    @Column(nullable = false)
    private String tipoMovimentacao;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Double precoUnitario;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataMovimentacao = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "usuario_id", foreignKey = @ForeignKey(name = "fk_movimentacao_usuario"))
    private Usuarios usuario;
}
