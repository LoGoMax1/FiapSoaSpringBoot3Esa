package br.com.fiap3esa.spring_boot_project.instrutor;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

public record DadosListagemInstrutor(
    String nome,
    String email,
    String cnh,
    Especialidade especialidade){

    public DadosListagemInstrutor (Instrutor instrutor) {
        this(instrutor.getNome(), instrutor.getEmail(), instrutor.getCnh(), instrutor.getEspecialidade());
    }
}
