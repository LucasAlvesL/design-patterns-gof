package com.design.patterns.design_patterns_gof.modules.services;

import com.design.patterns.design_patterns_gof.modules.entities.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json")
    Address getAddress(@PathVariable("cep") String cep);
}
