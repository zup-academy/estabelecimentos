package com.zupedu.estabelecimentos.unidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidades")
public class UnidadeController {

    @Autowired
    private UnidadeRepository repository;

    @PostMapping
    public UnidadeResponse incluir(@RequestBody UnidadeRequest request){

        var unidade = request.getUnidade();

        unidade = repository.save(unidade);

        return UnidadeResponse.from(unidade);
    }


}
