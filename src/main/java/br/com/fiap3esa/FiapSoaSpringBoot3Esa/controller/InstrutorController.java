package br.com.fiap3esa.FiapSoaSpringBoot3Esa.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {
    @PostMapping
    public void cadastararInstrutor(@RequestBody String json){
        System.out.println(json);
    }
}
