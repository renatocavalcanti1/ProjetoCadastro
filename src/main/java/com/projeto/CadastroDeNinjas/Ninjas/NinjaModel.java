package com.projeto.CadastroDeNinjas.Ninjas;

import com.projeto.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign key ou chave estrangeira
    private MissoesModel missoes;

}
