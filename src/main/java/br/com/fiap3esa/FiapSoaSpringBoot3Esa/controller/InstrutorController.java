package br.com.fiap3esa.FiapSoaSpringBoot3Esa.controller;


import br.com.fiap3esa.FiapSoaSpringBoot3Esa.instrutor.DadosCadastroInstrutor;
import br.com.fiap3esa.FiapSoaSpringBoot3Esa.instrutor.Instrutor;
import br.com.fiap3esa.FiapSoaSpringBoot3Esa.instrutor.InstrutorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

    @Autowired
    InstrutorRepository repository;

    @PostMapping()
    @Transactional
    public void cadastararInstrutor(@RequestBody DadosCadastroInstrutor dados) {
        //System.out.println(dados);
        repository.save(new Instrutor(dados));
    }
}
