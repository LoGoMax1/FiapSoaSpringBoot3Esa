package br.com.fiap3esa.FiapSoaSpringBoot3Esa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class HealthCheckController {

    @GetMapping
    public String healthcheck(){
        return "Verificação de Integridade do Spring Boot, Turma 3ESA";
    }
}
