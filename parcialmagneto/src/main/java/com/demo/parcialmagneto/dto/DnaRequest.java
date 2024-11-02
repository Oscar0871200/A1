package com.demo.parcialmagneto.dto;

import lombok.Getter;
import lombok.Setter;
import com.demo.parcialmagneto.validators.ValidDna;
@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String [] dna;
}
