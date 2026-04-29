package br.com.fiap.brinquedos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TDS_TB_BRINQUEDOS")
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String tipo;
    private Integer classificacao;
    private String tamanho;
    private Double preco;
}