package com.algaworks.algafood.domain.model.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioModel {

    private Long id;
    private String nome;
    private String email;
}