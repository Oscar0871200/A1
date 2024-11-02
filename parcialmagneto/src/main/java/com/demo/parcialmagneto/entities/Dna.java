package com.demo.parcialmagneto.entities;

import jakarta.persistence.Entity;
import lombok.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class Dna extends Base implements Serializable {
    private String dna;

    private boolean isMutant;

}
