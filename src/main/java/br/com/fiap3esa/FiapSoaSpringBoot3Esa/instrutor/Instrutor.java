package br.com.fiap3esa.FiapSoaSpringBoot3Esa.instrutor;

import br.com.fiap3esa.FiapSoaSpringBoot3Esa.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "instrutores")
@Entity(name = "Instrutor")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Instrutor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;
    String nome;
    String email;
    String cnh;

    @Enumerated(EnumType.STRING)
    Especialidade especialidade;

    @Embedded
    Endereco endereco;

    public Instrutor(DadosCadastroInstrutor dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cnh = dados.cnh();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
}
