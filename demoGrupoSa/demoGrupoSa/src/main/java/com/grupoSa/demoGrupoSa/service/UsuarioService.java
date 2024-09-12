package com.grupoSa.demoGrupoSa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoSa.demoGrupoSa.entities.UsuarioEntities;
import com.grupoSa.demoGrupoSa.repositories.usuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    usuarioRepository usuarioRepository;

    public List<UsuarioEntities> getAlltimes(){

        return usuarioRepository.findAll();



    }
}
