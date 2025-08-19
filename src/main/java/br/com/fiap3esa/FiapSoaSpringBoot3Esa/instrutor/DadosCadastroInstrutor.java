package br.com.fiap3esa.FiapSoaSpringBoot3Esa.instrutor;

import br.com.fiap3esa.FiapSoaSpringBoot3Esa.endereco.DadosEndereco;

public record DadosCadastroInstrutor(String nome, String email, String cnh, Especialidade especialidade, DadosEndereco endereco ) {
}
