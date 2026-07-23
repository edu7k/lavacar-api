package com.lavacar.lavacar_api.services;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController{
    @GetMapping("/services")
    public List<ServiceDTO> getAll(){
        return List.of(
                new ServiceDTO(1L, "Lavagem Simples", 30, 25.00),
                new ServiceDTO(2L, "Lavagem Detalhada", 60, 25.00),
                new ServiceDTO(3L, "Lavagem Simples", 30, 25.00)
            );
    }

}
