package com.grupoSa.demoGrupoSa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupoSa.demoGrupoSa.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    

    @Autowired
    UsuarioService UsuarioService;

    @GetMapping
    
    public ResponseEntity<?> getTimes() {

       var times = UsuarioService.getAlltimes();

        return ResponseEntity.ok(times);

    }


    public ResponseEntity<?>postMethodName (@RequestBody CreateBookDto createBookDto{






    }
}
