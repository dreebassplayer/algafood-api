package com.algaworks.algafood.exceptions;


public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String msg){
        super(msg);
    }
}