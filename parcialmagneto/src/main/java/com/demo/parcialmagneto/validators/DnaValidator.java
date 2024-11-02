package com.demo.parcialmagneto.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DnaValidator implements ConstraintValidator<ValidDna, String[] > {

    private static final String VALID_CHARACTERS = "AGTC";

    @Override
    public void initialize(ValidDna constraintAnnotation) {

    }

    @Override
    public boolean isValid(String[] dna, ConstraintValidatorContext context) {
        if (dna == null) {
            return false; // El ADN no puede ser nulo
        }

        int n = dna.length;
        if (n == 0) {
            return false; // El ADN no puede estar vacío
        }

        for (String sequence : dna) {
            if (sequence == null || sequence.length() != n) {
                return false; // Todas las secuencias deben ser del mismo tamaño
            }
            for (char c : sequence.toCharArray()) {
                if (VALID_CHARACTERS.indexOf(c) == -1) {
                    return false; // Verifica si solo contiene caracteres válidos
                }
            }
        }
        return true; // Si pasa todas las validaciones, es válido
    }
}


/*package com.demo.parcialmagneto.validators;

import jakarta.validation.ConstraintValidator;

public class DnaValidator implements ConstraintValidator<ValidDna, String[] dna>{

    private static final String VALID_CHARACTERS = "AGTC";

    @Override
    public void initialize (ValidDna constraintAnnotation){
    }

    @Override
    public boolean isValid(String[] dna, ConstraintValidContext ) {
        if (dna == null) {
            return false;
        }

        int n = dna.length;
        if (n == 0) {
            return false;
        }

        for (String sequence : dna) {
            if (sequence == null || sequence.length() != n) {
                return false;
            }
            for (char c: sequence.toCharArray()) {
                if (VALID_CHARACTERS.indexOf(c) == -1) {
                    return false;
                }
            }
        }
        return true;
    }
}*/
